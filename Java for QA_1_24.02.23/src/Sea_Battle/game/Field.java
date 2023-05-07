package Sea_Battle.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static game.Constants.FIELD_SIZE;

public class Field {

    private char[][] field;
    private char emptyCell = '.';
    private char shipCell = 'O';
    private char destroyedShipCell = 'X';
    private char missedShotCell = '*';
    private List<Ship> ships = new ArrayList<>();

    public Field() {
        field = new char[FIELD_SIZE][FIELD_SIZE];
        init();
    }

    private void init() {
        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                field[i][j] = emptyCell;
            }
        }
    }

    public void fill() {
        createShips();

        Scanner scanner = new Scanner(System.in);

        for (Ship ship : ships) {
            repaint(false);

            String coordinates;

            do {
                System.out.printf("Устанавливаем корабль. Количество палуб: %d\n" +
                        "Введите координаты, например - А1 или а1.\n", ship.getDecks());

                coordinates = scanner.nextLine().toLowerCase();

                if (ship.getDecks() > 1) {
                    System.out.println("Введите расположение: V - вертикальный, H - горизонтальный.");

                    if (scanner.nextLine().equalsIgnoreCase("v")) {
                        ship.setVertical(true);
                    }
                }

                System.out.println();

            } while (!isCoordinatesCorrect(coordinates, ship));
        }
        repaint(false);
        System.out.println("Поле успешно заполнено. Ждите...");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException ignored) {
        }

        printBlackScreen();
    }

    private boolean isCoordinatesCorrect(String coordinates, Ship ship) {
        int x;
        int y;
        String errorMessage = "ОШИБКА! Вы ввели некорректные координаты или корабль выходит за пределы поля. Повторите ввод.";
        try {
            if (coordinates.length() < 2 || coordinates.length() > 3) {
                System.out.println(errorMessage);
                return false;
            }

            x = coordinates.charAt(0) - 97;
            y = Integer.parseInt(coordinates.substring(1)) - 1;

            if (ship.isVertical()) {
                if (x < 0 || x > 9 || y < 0 || y > 10 - ship.getDecks()) {
                    System.out.println(errorMessage);
                    return false;
                }
            } else {
                if (x < 0 || x > 10 - ship.getDecks() || y < 0 || y > 9) {
                    System.out.println(errorMessage);
                    return false;
                }
            }

            if (isPlaceForShipNotFree(x, y, ship)) {
                return false;
            }
        } catch (Exception e) {
            System.out.println(errorMessage);
            return false;
        }

        placeShip(x, y, ship);
        return true;
    }

    private void placeShip(int x, int y, Ship ship) {
        boolean isVertical = ship.isVertical();
        int decks = ship.getDecks();

        for (int i = 0; i < decks; i++) {
            field[x][y] = shipCell;
            if (isVertical) {
                y++;
            } else {
                x++;
            }
        }
    }

    private boolean isPlaceForShipNotFree(int x, int y, Ship ship) {
        boolean isVertical = ship.isVertical();
        int decks = ship.getDecks();
        int xStart = x - 1;
        int xEnd = isVertical ? x + 1 : x + decks;
        int yStart = y - 1;
        int yEnd = isVertical ? y + decks : y + 1;

        for (int i = xStart; i <= xEnd; i++) {
            for (int j = yStart; j <= yEnd; j++) {
                try {
                    if (field[i][j] != emptyCell) {
                        System.out.println("ОШИБКА! Корабль соприкасается или пересекается с другим кораблём.");
                        return true;
                    }
                } catch (Exception ignored) {
                }
            }
        }

        return false;
    }

    public void repaint(boolean forOpponent) {
        String fieldName = forOpponent ? "Поле противника" : "Игровое поле";
        System.out.printf("    %s.\n    A B C D E F G H I J\n", fieldName);

        for (int i = 0; i < field.length; i++) {
            System.out.print(i + 1 + "  ");

            if (i < field.length - 1) {
                System.out.print(" ");
            }

            for (char[] chars : field) {
                char forDisplay = chars[i];

                if (forDisplay == shipCell && forOpponent) {
                    forDisplay = emptyCell;
                }

                System.out.print(forDisplay + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private void createShips() {
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= 5 - i; j++) {
                ships.add(new Ship(i));
            }
        }
    }

    private void printBlackScreen() {
        for (int i = 0; i < 30; i++) {
            System.out.println();
        }
    }

    public boolean isCoordinatesForShotCorrect(String coordinates) {
        int x;
        int y;
        String errorMessage = "ОШИБКА! Вы ввели некорректные координаты. Повторите ввод.";
        try {
            if (coordinates.length() < 2 || coordinates.length() > 3) {
                System.out.println(errorMessage);
                return false;
            }

            x = coordinates.charAt(0) - 97;
            y = Integer.parseInt(coordinates.substring(1)) - 1;
        } catch (Exception e) {
            System.out.println(errorMessage);
            return false;
        }

        if (x < 0 || x > 9 || y < 0 || y > 9) {
            System.out.println(errorMessage);
            return false;
        }

        return true;
    }

    public boolean receiveShot(String coordinates) {
        int x = coordinates.charAt(0) - 97;
        int y = Integer.parseInt(coordinates.substring(1)) - 1;
        char cell = field[x][y];

        if (cell == destroyedShipCell || cell == missedShotCell) {
            System.out.println("Вы сюда уже стреляли. Повторите ход.\n");
            return false;
        } else if (cell == emptyCell) {
            field[x][y] = missedShotCell;
            printBlackScreen();
            System.out.println("Промах! Переход хода.");
            return true;
        } else {
            field[x][y] = destroyedShipCell;
            System.out.println("Попадание!\n");

            if (isAllShipsDestroyed()) {
                repaint(true);
                System.out.println("Все корабли уничтожены!");
                SeaBattle.isGameOver = true;
                return true;
            } else {
                return false;
            }
        }
    }

    public boolean isAllShipsDestroyed() {
        for (char[] row : field) {
            for (char cell : row) {
                if (cell == shipCell) {
                    return false;
                }
            }
        }
        return true;
    }
}
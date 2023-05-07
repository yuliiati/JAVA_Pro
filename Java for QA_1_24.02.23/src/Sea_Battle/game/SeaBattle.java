package Sea_Battle.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static game.Constants.MOVE_CHANGE_TIME;
/*

Игра Морской бой.

Консольное приложение.
Одновременно в игре могут участвовать только два человека.
Игроки вводят имена.
У каждого игрока есть своё поле - квадрат 10х10 клеток
По очереди расставляют свои корабли.
4 однопалубных корабля,
3 двухпалубных,
2 трехпалубных,
1 четырёхпалубный.
Корабли можно располагать только по горизонтали или по вертикали.
Между кораблями должна быть минимум одна клетка
Игроки не видят расположение кораблей друг друга.
Начинается игра. Первый игрок делает выстрел, сообщая нашему приложению координаты предполагаемой цели - номер клетки по горизонтали и номер клетки по вертикали.
Если выстрел первого игрока оказался удачным, и он поразил цель, то возможно два варианта развития событий.
Первый вариант: в указанной игроком клетки находится корабль, то, если корабль однопалубный, игрок "убил" корабль, если не однопалубный, то ранил. Следующий ход за первым игроком.
Второй вариант: игрок не попал ни в какой корабль, ход переходит второму игроку.
Таким образом, возвращаемся в пункт 8, передавая ход друг другу, игроки пытаются как можно раньше уничтожить корабли друг друга. Тот, кто первым, уничтожит все корабли - победитель. Печатаем поздравление и выход из игры.


Начать реализацию или продолжить, то что не успели во время лекции.
*/
public class SeaBattle {

    private static List<Player> players = new ArrayList<>();
    public static boolean isGameOver;
    private static Player winner;

    public static void main(String[] args) {

        System.out.println("Игра \"Морской бой\".\n");

        createPlayers();
        fillGameFields();
        game();
        showWinner();
    }

    private static void createPlayers() {
        Scanner scanner = new Scanner(System.in);
        String name;

        do {
            System.out.println("Игрок 1, пожалуйста, введите своё имя.");
            name = scanner.nextLine();
        } while (name.isEmpty());

        players.add(new Player(name, new Field()));
        System.out.println();

        do {
            System.out.println("Игрок 2, пожалуйста, введите своё имя.");
            name = scanner.nextLine();
        } while (name.isEmpty());

        players.add(new Player(name, new Field()));
        System.out.println();
    }

    private static void fillGameFields() {
        for (Player player : players) {
            System.out.printf("%s, через %d секунд начнётся заполнение Вашего поля.\n" +
                            "%s, пожалуйста, не смотрите в экран.\n\n",
                    player.getName(), MOVE_CHANGE_TIME / 1000, getAnotherPlayer(player).getName());

            changeMovePause();
            player.fillGameField();
        }
    }

    private static void game() {
        while (!isGameOver) {

            for (Player player : players) {
                System.out.printf("%s, через %d секунд начнётся Ваш ход.\n" +
                                "%s, пожалуйста, не смотрите в экран.\n\n",
                        player.getName(), MOVE_CHANGE_TIME / 1000, getAnotherPlayer(player).getName());

                changeMovePause();
                player.getField().repaint(false);
                makeMove(player);

                if (isGameOver) {
                    break;
                }
            }
        }
    }

    private static void makeMove(Player player) {
        boolean isMoveComplete = false;

        while (!isMoveComplete) {
            isMoveComplete = player.makeShot(getAnotherPlayer(player).getField());
        }

        if (isGameOver) {
            winner = player;
        }
    }

    private static void showWinner() {
        System.out.printf("Победил %s!\n", winner.getName());
    }

    private static Player getAnotherPlayer(Player currentPlayer) {
        Player result = null;
        for (Player player : players) {
            if (!currentPlayer.equals(player)) {
                result = player;
            }
        }
        return result;
    }

    private static void changeMovePause() {
        try {
            Thread.sleep(MOVE_CHANGE_TIME);
        } catch (InterruptedException ignored) {
        }
    }
}
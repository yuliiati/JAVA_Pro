package Sea_Battle;

import javax.swing.text.html.HTMLWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Player {

    private String name;    //имя игрока
    private char[][] field;
    private int fieldSize = 10; //Ка случай изменения. значения легко потмо заменить в коде(переписать)
    // В КОДЕ ЛУЧШЕ ПОЛЬЗ. ПЕРЕМЕННЫМИ, не числами (10x10 напр.)
    private int[][] deckShipAmount = {{4, 1}, {3, 2}, {2, 3}, {1, 4}};
    private char emptyCell = '.'; // char в одинарных кавычках
    private char valueForShip = 'O'; // буква O большая :))
    private boolean isAlive = true; // как только false - конец игры.
    public Player(String name) {    //имя игрока не измен, не будем! геттеры и сеттеры доб
        this.name = name;
        this.field = new char[fieldSize][fieldSize]; //10x10
    }
    public String getName() {
        return name;
    }

    public char[][] getField() {
        return field;
    }

    @Override
    public String toString() {
        return name;
    }
    private void initialFill () {
        for (int i = 0; i < fieldSize; i++) {
            for (int j = 0; j < fieldSize; j++) {
                field[i][j] = emptyCell;
            }
        }
    }

    public void printField() {
        for (char[] row : field) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
    public void fillGameField() {

        Scanner scanner = new Scanner(System.in);

        for (int[] row : deckShipAmount) {
           int decks = row[0];
           int ships = row[1];
//           System.out.println();
           for (int i = 0; i < ships; i++) {
               System.out.printf("%s, разместите корабль на %d палубы.\n ", name, decks); //Форматированный вывод
               System.out.printf("Введите ряд.");
               // Здесь везде должны быть проверки на корректность введённых значений.
               int inputtedRow = Integer.parseInt(scanner.nextLine()); //string convert to int! what!(/_
               System.out.println("ВВедите столбец.");
               int inputtedCollumn = Integer.parseInt(scanner.nextLine());
               System.out.println("Выберите расположение: 1 - горизонтальное, 2 - вертикальное.");
               int direction = Integer.parseInt(scanner.nextLine());

               // Проверка корректности введённых координат. ДОМАШКА)) 0 - x, 0 - "-"
              // Не соприкасаются ли, и не выходят ли за границы поля


               placeShip(inputtedRow, inputtedCollumn, direction, decks); // x,y => y,xРазмещаем корабль, потом нужно еще отрисовать для польз
               printField(); // Отрисовка корабля
           }
       }
    } //public потому что хотим обратиться из осного класса

    private void placeShip(int x, int y, int direction, int decks) {
        for (int i = 0; i < decks; i++) {
            field[x][y] = valueForShip;
            if (direction == 1) {
                x++;    //x++;
            } else {
                y++;    //y++;
            }
        }
    }

    private <inputtedRow, inputtedCollumn> boolean isCoordinatesCorrect(inputtedRow, inputtedCollumn, int direction, int decks) {
        //TODO HW
        // Блабла
        // Вернуть true, если координаты корректны,
        // то есть корабль не соприкасается и не пересекает другие
        // и не выходит за пределы поля.
        // Иначе вернуть false.
    }
}

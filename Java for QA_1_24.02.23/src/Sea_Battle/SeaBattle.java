package Sea_Battle;

import java.util.Scanner;

public class SeaBattle {

    private static Player[] players = new Player[2];


    public static void main(String[] args) {

        //TODO: 27.03.2023:
        // 1. Создание игроков
        createPlayers();
        // 2. Заполнение полей игроков
        fillPlayerfields();
        // 3. Старт игры
        // 4. Вывод результатов
    }
private static void createPlayers() {   // Создали метод и добавили игроков в список
        Scanner scanner = new Scanner(System.in);

    System.out.println("Морской бой.");
    System.out.println("Игрок 1, введите своё имя.");
    String name = scanner.nextLine();
//    Player player1 = new Player(name);
    players[0] = new Player(name);
//    players[0].printField();  не точки, а квадраты


    System.out.println("Игрок 2, введите своё имя.");
    name = scanner.nextLine();
    players[1] = new Player(name);
    }

    private static void fillPlayerfields() {    //METHOD
        for (Player player : players) { //перебираем циклом массив с 2 игроками
            player.fillGameField(); //вызываем метод филлгейм. Размер цикла 2 итерации - 2 игрока
        }
    }
}

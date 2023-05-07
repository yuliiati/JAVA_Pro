package Sea_Battle.game;

import java.util.Objects;
import java.util.Scanner;

public class Player {

    private String name;
    private Field field;

    public Player(String name, Field field) {
        this.name = name;
        this.field = field;
    }

    public void fillGameField() {
        field.fill();
    }

    public boolean makeShot(Field opponentField) {
        Scanner scanner = new Scanner(System.in);
        String coordinates;
        opponentField.repaint(true);

        do {
            System.out.printf("%s, введите координаты для выстрела, например - А1 или а1.\n", name);
            coordinates = scanner.nextLine();
            System.out.println();
        } while (!opponentField.isCoordinatesForShotCorrect(coordinates));

        return opponentField.receiveShot(coordinates);
    }

    public String getName() {
        return name;
    }

    public Field getField() {
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(name, player.name) && Objects.equals(field, player.field);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, field);
    }

    @Override
    public String toString() {
        return name;
    }
}
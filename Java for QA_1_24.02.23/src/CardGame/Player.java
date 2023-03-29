package CardGame;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<String> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<String> getHand() {
        return hand;
    }

    public void addToHand(String card) {
        hand.add(card);
    }

    public void printHand() {
        System.out.println(name + "'s hand: ");
        for (String card : hand) {
            System.out.println(card);
        }
    }
}


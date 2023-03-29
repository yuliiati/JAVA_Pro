package CardGame;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Deck deck;
    private List<Player> players;

    public Game(int numPlayers) {
        this.deck = new Deck();
        this.players = new ArrayList<>();
        for (int i = 1; i <= numPlayers; i++) {
            players.add(new Player("Player " + i));
        }
    }

    public void play() {
        deck.shuffle();
        String[] numCards = deck.getCards();

    }
}
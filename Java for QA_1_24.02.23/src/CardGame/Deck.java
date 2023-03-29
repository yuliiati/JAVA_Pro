package CardGame;

import java.util.Random;

public class Deck {
    private String[] suits = {"clubs", "diamonds", "hearts", "spades"};
    private String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    private String[] cards;

    public Deck() {
        this.cards = new String[rank.length * suits.length];
        int index = 0;

        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                this.cards[index++] = rank[i] + " " + suits[j];
            }
        }
    }

    public String[] getCards() {
        return cards;
    }

    public void shuffle() {
        Random random = new Random();
        for (int i = 0; i < cards.length; i++) {
            String currentCard = cards[i];
            int randomIndex = random.nextInt(cards.length);
            String randomCard = cards[randomIndex];
            cards[i] = randomCard;
            cards[randomIndex] = currentCard;
        }
    }
}


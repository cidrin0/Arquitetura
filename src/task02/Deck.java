package task02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {

    private static Deck deck;

    private List<Card> cards;

    private Deck() {
        cards = new ArrayList<>();

        // build the deck
        for (Suit suit : new Suit[]{Suit.SPADES, Suit.HEARTS, Suit.CLUBS, Suit.DIAMONDS})
            for (int i = 2; i <= 14; i++) cards.add(new Card(suit, i));

        // shuffle it!
        Collections.shuffle(cards, new Random());
    }

    public static synchronized Deck getInstance() {
        return deck == null ? (deck = new Deck()) : deck;
    }

    public void print() {
        cards.forEach(Card::print);
    }
}

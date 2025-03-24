package carddeck;

import java.util.*;

public class CardGameSimulation {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        List<Card> drawnCards = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            drawnCards.add(deck.drawCard());
        }

        System.out.println("Drawn Cards (Unsorted):");
        for (Card card : drawnCards) {
            System.out.println(card);
        }

        drawnCards.sort(new CardComparator());

        System.out.println("\nDrawn Cards (Sorted):");
        for (Card card : drawnCards) {
            System.out.println(card);
        }
    }
}

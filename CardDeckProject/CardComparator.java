package carddeck;

import java.util.Comparator;

public class CardComparator implements Comparator<Card> {
    @Override
    public int compare(Card c1, Card c2) {
        int color1 = (c1.getSuit() == Suit.HEART || c1.getSuit() == Suit.DIAMOND) ? 0 : 1;
        int color2 = (c2.getSuit() == Suit.HEART || c2.getSuit() == Suit.DIAMOND) ? 0 : 1;

        if (color1 != color2) {
            return Integer.compare(color1, color2);
        }

        int suitComparison = c1.getSuit().compareTo(c2.getSuit());
        if (suitComparison != 0) {
            return suitComparison;
        }

        return c1.getRank().compareTo(c2.getRank());
    }
}

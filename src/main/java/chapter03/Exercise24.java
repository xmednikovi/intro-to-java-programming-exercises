package chapter03;

import java.util.Random;

public class Exercise24 {

    public static void main(String[] args) {
        Random random = new Random();
        String[] ranks = new String[]{"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suits = new String[]{"Clubs", "Diamonds", "Hearts", "Spades"};

        int rank = random.ints(0, ranks.length).findFirst().getAsInt();
        int suit = random.ints(0, suits.length).findFirst().getAsInt();

        String card = ranks[rank] + " of " + suits[suit];
        System.out.println(card);
    }
}

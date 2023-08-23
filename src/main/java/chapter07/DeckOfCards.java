package chapter07;

public class DeckOfCards {

    public static void main(String[] args) {
        int[] desk = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
                "10", "Jack", "Queen", "King"};
        // initialize
        for (int i = 0; i < desk.length; i++){
            desk[i] = i;
        }

        // shuffle
        for (int i = 0; i < desk.length; i++){
            int newIndex = (int) (Math.random() * desk.length);
            if (newIndex != i) {
                int swap = desk[i];
                desk[i] = desk[newIndex];
                desk[newIndex] = swap;
            }
        }

        // display first 10 cards
        for (int i = 0; i < 10; i ++) {
            int card = desk[i];
            int suitIndex = card / 13;
            int rankIndex = card % 13;
            System.out.printf("%s of %s\n", ranks[rankIndex], suits[suitIndex]);
        }
    }
}

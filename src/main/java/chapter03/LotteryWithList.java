package chapter03;

import java.util.List;
import java.util.Scanner;

public class LotteryWithList {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lottery = (int) (Math.random() * 100);
        System.out.println(lottery);

        System.out.print("Enter your lottery pick: ");
        int guess = input.nextInt();

        int lotteryDigit1 = lottery / 10;
        int lotteryDigit2 = lottery % 10;

        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        List<Integer> lotteryDigits = List.of(lotteryDigit1, lotteryDigit2);
        List<Integer> guessDigits = List.of(guessDigit1, guessDigit2);

        if (lotteryDigits.containsAll(guessDigits)) {
            if (lottery == guess) {
                System.out.println("Exact match");
            } else {
                System.out.println("Match all digits");
            }
        } else if (lotteryDigits.contains(guessDigit1) || lotteryDigits.contains(guessDigit2)) {
            System.out.println("Matched one digit");
        } else {
            System.out.println("Sorry no match");
        }

//        if (guess == lottery) {
//            System.out.println("Exact match!");
//        } else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2) {
//            System.out.println("Match all digits");
//        } else if (
//                guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 ||
//                        guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2
//        ) {
//            System.out.println("Match one digit");
//        } else {
//            System.out.println("Sorry no match");
//        }
    }
}

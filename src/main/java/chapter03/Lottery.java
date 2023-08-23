package chapter03;

import java.util.Scanner;

public class Lottery {

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

        if (guess == lottery) {
            System.out.println("Exact match!");
        } else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2) {
            System.out.println("Match all digits");
        } else if (
                guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 ||
                        guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2
        ) {
            System.out.println("Match one digit");
        } else {
            System.out.println("Sorry no match");
        }
    }
}

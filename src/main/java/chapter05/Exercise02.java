package chapter05;

import java.util.Random;
import java.util.Scanner;

public class Exercise02 {

    public static void main(String[] args) {
        final int NUMBER_OF_ANSWERS = 5;
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int count = 0;
        int correctCount = 0;
        do {
            int number1 = random.nextInt(1, 13);
            int number2 = random.nextInt(1, 13);
            if (number1 > number2) {
                int swap = number1;
                number1 = number2;
                number2 = swap;
            }
            System.out.printf("How much is %d - %d = ?", number2, number1);
            int answer = input.nextInt();
            int result = number2 - number1;
            if (answer == result){
                correctCount ++;
            }
            count ++;
        } while (count < NUMBER_OF_ANSWERS);

        System.out.println("Finished! Correct answers: " + correctCount);
    }
}

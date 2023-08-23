package chapter05;

import java.util.Random;
import java.util.Scanner;

public class SubtractionQuiz {

    public static void main(String[] args) {
        final int NUMBER_OF_QUESTIONS = 5;

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int questionsCount = 0;
        int correctCount = 0;

        while (questionsCount <= NUMBER_OF_QUESTIONS){
            int number1 = random.ints(1, 15).findFirst().getAsInt();
            int number2 = random.ints(1, 15).findFirst().getAsInt();
            if (number2 < number1) {
                int swap = number2;
                number2 = number1;
                number1 = swap;
            }
            System.out.printf("How much is %d - %d ?", number2, number1);
            int answer = input.nextInt();
            int result = number2 - number1;
            if (answer == result ){
                correctCount ++;
            }
            questionsCount ++;
        }

        System.out.println("Correct answers: " + correctCount);
    }
}

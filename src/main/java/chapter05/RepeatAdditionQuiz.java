package chapter05;

import java.util.Scanner;

public class RepeatAdditionQuiz {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        System.out.printf("What is %d + %d ?", number1, number2);
        int result = number1 + number2;
        int answer = input.nextInt();
        while (answer != result) {
            System.out.printf("Wrong answer! The correct is %d. Try again: ", result);
            answer = input.nextInt();
        }
        System.out.println("You got it!");
    }
}

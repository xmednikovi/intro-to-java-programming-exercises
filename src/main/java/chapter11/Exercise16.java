package chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> answers = new ArrayList<>();
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        System.out.printf("What is %d + %d ?", number1, number2);
        int result = number1 + number2;
        int answer = input.nextInt();
        while (answer != result) {
            if (answers.contains(answer)) {
                System.out.println("You already answered " + answer + "! Try again: ");
            }
            else {
                answers.add(answer);
                System.out.println("Wrong answer! Try again: ");
            }
            answer = input.nextInt();
        }
        System.out.println("You got it!");
    }
}

package chapter03;

import java.util.Scanner;

public class AdditionQuiz {

    public static void main(String[] args) {
        int number1 = (int) (System.currentTimeMillis() % 10);
        int number2 = (int) (System.currentTimeMillis() / 10 % 10);

        Scanner input = new Scanner(System.in);

        System.out.print("What is "+ number1 + "+" + number2 + "?");
        int answer = input.nextInt();

        int result = number1 + number2;

        if (result == answer) {
            System.out.println("Correct");
        } else {
            System.out.println("Not correct");
        }
    }
}

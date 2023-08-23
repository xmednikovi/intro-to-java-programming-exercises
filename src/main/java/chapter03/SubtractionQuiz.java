package chapter03;

import java.util.Scanner;

public class SubtractionQuiz {

    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        System.out.print("What is " + number1 + "-" + number2 + "?");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        int result = number1 - number2;
        if (result == answer){
            System.out.println("You are right!");
        } else {
            System.out.println("No! It should be " + result);
        }
    }
}

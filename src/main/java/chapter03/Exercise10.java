package chapter03;

import java.util.Scanner;

public class Exercise10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        System.out.print("How much is " + number1 + "x" + number2 + "=?");
        int result = input.nextInt();

        if (result == number1 * number2) {
            System.out.println("Correct!");
        } else {
            System.out.println("No! The correct answer is " + number1*number2);
        }
    }
}

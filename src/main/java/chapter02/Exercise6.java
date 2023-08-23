package chapter02;

import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args){
        System.out.print("Please enter a number 0..1000: ");

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int result = 1;

        while (number > 0) {
            result = result * (number % 10);
            number = number / 10;
        }

        System.out.println("The result is: " + result);
    }
}

package chapter03;

import java.util.Scanner;

public class Exercise12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter integer: ");
        String number = input.next();



        if (number.charAt(0) == number.charAt(2)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}

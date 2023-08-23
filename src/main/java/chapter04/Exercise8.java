package chapter04;

import java.util.Scanner;

public class Exercise8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a character: ");
        String line = input.nextLine();
        char character = line.charAt(0);
        int code = (int) character;
        System.out.println("The code is " + code);
    }
}

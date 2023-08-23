package chapter04;

import java.util.Scanner;

public class Exercise20 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String s = input.nextLine();
        int length = s.length();
        char last = s.charAt(s.length() - 1);
        System.out.printf("String length: %d ; Last character: %c", length, last);
    }
}

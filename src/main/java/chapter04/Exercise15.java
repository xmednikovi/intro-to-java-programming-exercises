package chapter04;

import java.util.Scanner;

public class Exercise15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String letter = input.nextLine().toLowerCase();
        if (Character.isAlphabetic(letter.charAt(0))) {
            int number = 0;
            if ("def".contains(letter)) {
                number = 3;
            } else if ("ghi".contains(letter)) {
                number = 4;
            } else if ("jkl".contains(letter)) {
                number = 5;
            } else if ("mno".contains(letter)){
                number = 6;
            } else if ("pqrs".contains(letter)) {
                number = 7;
            } else if ("tuv".contains(letter)) {
                number = 8;
            } else if ("abc".contains(letter)){
                number = 2;
            } else {
                number = 9;
            }
            System.out.printf("The corresponding number is %d", number);
        } else {
            System.out.printf("%s is an invalid inout", letter);
        }
    }
}

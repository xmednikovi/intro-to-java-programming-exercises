package chapter05;

import java.util.Scanner;

public class Palindromes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter word:");
        String word = input.nextLine();
        int lowIndex = 0;
        int highIndex = word.length() - 1;
        int count = 0;
        for (int i=0; i<word.length(); i++) {
            char lowChar = word.charAt(lowIndex);
            char highChar = word.charAt(highIndex);
            if (lowChar != highChar) {
                System.out.println("This word is not palindrome!");
                break;
            } else {
                count ++;
                lowIndex ++;
                highIndex --;
            }
        }

        if (count == word.length()) {
            System.out.println("This word is not palindrome!");
        }
    }
}

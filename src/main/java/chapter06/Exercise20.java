package chapter06;

import java.util.Scanner;

public class Exercise20 {

    public static int countLetters (String input){
        int numberOfLetters = 0;
        for (int i = 0; i < input.length(); i ++) {
            char c = input.charAt(i);
            if (Character.isLetter(c)) {
                numberOfLetters ++;
            }
        }
        return numberOfLetters;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String input = scanner.nextLine();
        int numberOfLetters = countLetters(input);
        System.out.printf("The number of letters is %d", numberOfLetters);
    }
}

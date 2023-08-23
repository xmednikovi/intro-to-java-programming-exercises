package chapter04;

import java.util.List;
import java.util.Scanner;

public class Exercise13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> vowels = List.of("A", "O", "E", "U");
        System.out.print("Enter a letter: ");
        String value = input.nextLine();
        char c = value.charAt(0);
        if (Character.isAlphabetic(c)){
            if (vowels.contains(value.toUpperCase())) {
                System.out.printf("%s is a vowel", value);
            } else {
                System.out.printf("%s if a consonant", value);
            }
        } else {
            System.out.printf("%s is an invalid input", value);
        }
    }
}

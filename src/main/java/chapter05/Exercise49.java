package chapter05;

import java.util.List;
import java.util.Scanner;

public class Exercise49 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string:");
        String input = scanner.nextLine().toUpperCase();
        int numberOfVowels = 0;
        int numberOfConsonants = 0;
        List<Character> vowels = List.of('A', 'E', 'I', 'O', 'U');

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (vowels.contains(c)) {
                numberOfVowels ++;
            } else {
                if (c != 32) {
                    numberOfConsonants ++;
                }
            }
        }

        System.out.printf("The number of vowels is %d\nThe number of consonants is %d", numberOfVowels, numberOfConsonants);
    }
}

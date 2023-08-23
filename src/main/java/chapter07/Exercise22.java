package chapter07;

import java.util.Scanner;

public class Exercise22 {

    public static boolean isInArray(char[] arr, char ch){
        for (int i = 0; i < arr.length; i ++){
            if (arr[i] == ch){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // number of vowels
        int vowelsUpperCase = 0;
        int vowelLowerCase = 0;

        char[] upperCaseVowels = {'A', 'I', 'O', 'E', 'U'};
        char[] lowerCaseVowels = {'a', 'i', 'o', 'e', 'u'};

        // count
        for (int i = 0; i < input.length(); i ++) {
            // get next character
            char nextCharacter = input.charAt(i);

            // if is in upper case array -> increment vowelsUpperCase
            if (isInArray(upperCaseVowels, nextCharacter)) {
                vowelsUpperCase++;
            } else if (isInArray(lowerCaseVowels, nextCharacter)) {
                vowelLowerCase ++;
            } else {
                continue;
            }
        }

        System.out.printf("The number of upper case vowels: %d\nThe number of lower case vowels: %d\n",
                vowelsUpperCase, vowelLowerCase);
    }
}

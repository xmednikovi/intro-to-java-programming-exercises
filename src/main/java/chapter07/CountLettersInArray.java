package chapter07;

import java.util.Arrays;

public class CountLettersInArray {

    public static void main(String[] args) {
        // initialize array
        char[] letters = new char[100];
        for (int i = 0; i < letters.length; i ++){
            // generate random number
            int random = (int) (Math.random() * (123 - 97) + 97);
            letters[i] = (char) random;
        }

        int[] occurences = new int[26];
        for (int i = 0; i < letters.length; i ++) {
            // get a char as 0 - 26, where a is 0 and z is 26
            int n = letters[i] - 97;
            // increment a number is position
            occurences[n] = occurences[n] + 1;
        }
        System.out.println(Arrays.toString(letters));
//        System.out.println(Arrays.toString(occurences));

        for (int i = 0; i < occurences.length; i ++) {
            char letter = (char) (i + 97);
            System.out.printf("%c occures %d times\n", letter, occurences[i]);
        }
    }
}

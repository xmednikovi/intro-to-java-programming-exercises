package chapter07;

import java.util.Scanner;

public class Exercise02 {

    public static void main(String[] args) {
        int[] numbers = new int[11];

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter 11 integers: ");
        for (int i = 0; i < 11; i ++) {
            int input = scanner.nextInt();
            numbers[i] = input;
        }

        // compare each number with 11th
        int eleventhNumber = numbers[10];

        for (int i = 0; i < 10; i ++) {
            int number = numbers[i];
            if (number > eleventhNumber) {
                System.out.printf("The number with index %d is %d and it is larger than %d\n", i, number, eleventhNumber);
            } else if (number < eleventhNumber) {
                System.out.printf("The number with index %d is %d and it is smaller than %d\n", i, number, eleventhNumber);
            } else {
                System.out.printf("The number with index %d is %d and it is equal to %d\n", i, number, eleventhNumber);
            }
        }
    }
}

package chapter06;

import java.util.Scanner;

public class Exercise06 {

    public static void displayPattern (int numberOfLines){
        for (; numberOfLines >= 0; numberOfLines --) {
            for (int row = 1; row <= numberOfLines; row ++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number of lines: ");
        int numberOfLines = scanner.nextInt();
        displayPattern(numberOfLines);
    }
}

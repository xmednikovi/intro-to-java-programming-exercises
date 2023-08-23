package chapter05;

import java.util.Scanner;

public class Exercise17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number of lines: ");
        int numberOfLines = input.nextInt();
        for ( ; numberOfLines > 0; numberOfLines--) {
            for (int numberOfRows = numberOfLines; numberOfRows > 0; numberOfRows --) {
                System.out.print(numberOfRows + " ");
            }
            System.out.println();
        }



    }
}

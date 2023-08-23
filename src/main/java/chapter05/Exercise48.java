package chapter05;

import java.util.Scanner;

public class Exercise48 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String value = input.nextLine();
        for (int i = 0; i < value.length(); i ++) {
            if (i % 2 != 0) {
                if (value.charAt(i) != 32) {
                    System.out.print(value.charAt(i));
                }
            }
        }
    }
}

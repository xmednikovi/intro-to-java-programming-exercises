package chapter04;

import java.util.Scanner;

public class Exercise11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter binary number: ");
        String binary = input.nextLine();
        Integer decimal = Integer.parseInt(binary, 2);
        System.out.printf("The decimal is %d", decimal);
    }
}

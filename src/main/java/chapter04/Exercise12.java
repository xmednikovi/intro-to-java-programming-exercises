package chapter04;

import java.util.Scanner;

public class Exercise12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a hex number: ");
        String hex = input.nextLine();
        try {
            int decimal = Integer.parseInt(hex, 16);
            System.out.printf("The binary is: %s", Integer.toBinaryString(decimal));
        } catch (NumberFormatException ex){
            System.out.printf("%s is an invalid input!", hex);
        }
    }
}

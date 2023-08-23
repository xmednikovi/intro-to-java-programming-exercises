package chapter03;

import java.util.Scanner;

public class Exercise26 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number:");
        int number = input.nextInt();
        if (number % 4 == 0 && number % 5 == 0) {
            System.out.println("The number is divisble by 4 and 5");
        }
        if (number % 4 == 0 || number % 5 == 0) {
            System.out.println("The number is divisble by 4 or 5");
        }
        if (number % 4 == 0 ^ number % 5 == 0){
            System.out.println("The number is divisble by 4 or 5 but not both");
        }
    }
}

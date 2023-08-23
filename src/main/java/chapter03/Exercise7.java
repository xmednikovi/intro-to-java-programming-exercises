package chapter03;

import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount: ");
        double amount = input.nextDouble();

        int remainingAmount = (int) (amount * 100);
        int dollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        int quarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        int dimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        int nickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        int pennies = remainingAmount;
//
//        System.out.println("Dollars " + dollars);
//        System.out.println("Quarters " + quarters);
//        System.out.println("Dimes " + dimes);
//        System.out.println("nickels " + nickels);
//        System.out.println("pennies " + pennies);
        if (dollars > 1) {
            System.out.println(dollars + " dollars");
        } else {
            System.out.println(dollars + " dollar");
        }

        if (quarters > 1) {
            System.out.println(quarters + " quarters");
        } else {
            System.out.println(quarters + " quarter");
        }

        if (dimes > 1) {
            System.out.println(dimes + " dimes");
        } else {
            System.out.println(dimes + " dime");
        }

        if (nickels > 1) {
            System.out.println(nickels + " nickels");
        } else {
            System.out.println(nickels + " nickel");
        }

        if (pennies > 1) {
            System.out.println(pennies + " pennies");
        } else {
            System.out.println(pennies + " penny");
        }
    }
}

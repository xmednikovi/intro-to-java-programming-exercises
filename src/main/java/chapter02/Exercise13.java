package chapter02;

import java.util.Scanner;

public class Exercise13 {

    public static void main(String[] args){
        final double INTEREST_RATE = 0.003125;
        System.out.print("Enter the monthly saving amount: ");
        Scanner input = new Scanner(System.in);
        double monthlySavingAmount = input.nextDouble();

        double firstMonth = monthlySavingAmount * (1 + INTEREST_RATE);
        double secondMonth = (monthlySavingAmount + firstMonth) * (1 + INTEREST_RATE);
        double thirdMonth = (monthlySavingAmount + secondMonth) * (1 + INTEREST_RATE);
        double fourthMonth = (monthlySavingAmount + thirdMonth) * (1 + INTEREST_RATE);
        double fifthMonth = (monthlySavingAmount + fourthMonth) * (1 + INTEREST_RATE);
        double sixthMonth = (monthlySavingAmount + fifthMonth) * (1 + INTEREST_RATE);

        System.out.println("1st month value: " + firstMonth);
        System.out.println("2nd month value: " + secondMonth);
        System.out.println("3rd month value: " + thirdMonth);
        System.out.println("4th month value: " + fourthMonth);
        System.out.println("5th month value: " + fifthMonth);
        System.out.println("6th month value: " + sixthMonth);
    }
}

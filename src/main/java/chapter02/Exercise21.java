package chapter02;

import java.util.Scanner;

public class Exercise21 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter number of years");
        int numberOfYears = input.nextInt();

        double montlyInterestRate = annualInterestRate / 1200;
        double value = investmentAmount * Math.pow(1 + montlyInterestRate, numberOfYears * 12);

        System.out.println("Future value is " + value);
    }
}

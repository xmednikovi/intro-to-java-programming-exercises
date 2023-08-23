package chapter02;

import java.util.Scanner;

public class ComputeLoan {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = input.nextDouble();
        double monthlyInterestRate = annualInterestRate / 1200;

        System.out.println("Enter number of years: ");
        int numberOfYears = input.nextInt();

        System.out.println("Enter loan amount:");
        double loanAmount = input.nextDouble();

        double monthlyPayment = loanAmount * monthlyInterestRate
                / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        double totalPayment = monthlyPayment * numberOfYears * 12;

        double monthlyPaymentResult = (int) (monthlyPayment * 100) / 100.0;
        double totalPaymentResult = (int) (totalPayment * 100) / 100.0;
        System.out.println("The monthly payment is $" + monthlyPaymentResult);
        System.out.println("The total payment is $" + totalPaymentResult);
    }
}

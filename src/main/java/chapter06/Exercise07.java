package chapter06;

import java.util.Scanner;

public class Exercise07 {

    public static double futureInvestmentValue(double investmentAmount, double monthlyRate, int years){
        double value = investmentAmount * Math.pow(1 + monthlyRate, years * 12);
        return value;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("The amount invested: ");
        double amount = scanner.nextDouble();
        System.out.print("Annual interest rate: ");
        double annualInterestRate = scanner.nextDouble();

        double montlyRate = annualInterestRate / 1200;


        System.out.println("Years    Future value");
        for (int year = 1; year < 31; year++) {
            double value = futureInvestmentValue(amount, montlyRate, year);
            System.out.printf("%-2d         %7.2f\n", year, value);
        }
    }
}

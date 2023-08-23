package chapter02;

import java.util.Scanner;

public class Exercise20 {

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter balance and interest rate: ");
        double balance = input.nextDouble();
        double interestRate = input.nextDouble();

        double interest = balance * (interestRate / 1200);

        System.out.println("The interest is: " + interest);
    }
}

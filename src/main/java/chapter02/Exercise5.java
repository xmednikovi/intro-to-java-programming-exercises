package chapter02;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate ");
        int subtotal = input.nextInt();
        int gratuityRate = input.nextInt();
        double gratuityPercentage = (double) gratuityRate / 100;
        double gratuity = subtotal * gratuityPercentage;
        double total = gratuity + subtotal;

        System.out.println("The gratuity is $" + gratuity + " and total is $"+total);

    }
}

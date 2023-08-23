package chapter03;

import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {
        final double KILOS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Enter feet:");
        double feet = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double inches = input.nextDouble();

        double height = inches + feet * 12;
        double weightInKilos = weight * KILOS_PER_POUND;
        double heightInMeters = height * METERS_PER_INCH;

        double bmi = weightInKilos / Math.pow(heightInMeters, 2);

        System.out.println("Your BMI is " + bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}

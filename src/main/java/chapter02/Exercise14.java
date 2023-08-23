package chapter02;

import java.util.Scanner;

public class Exercise14 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weightInPounds = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double heightInInches = input.nextDouble();

        double weightInKg = weightInPounds * 0.45359237;
        double heightInMeters = heightInInches * 0.0254;

        double bmi =  weightInKg /  Math.pow(heightInMeters, 2);

//        System.out.printf("%1.0f", bmi);

        System.out.println("BMI is " + bmi);

    }
}

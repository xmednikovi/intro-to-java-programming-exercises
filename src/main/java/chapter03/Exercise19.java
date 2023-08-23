package chapter03;

import java.util.Scanner;

public class Exercise19 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter three sides of a triangle: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        if (a + b > c && a + c > b && b+c > a) {
            double perimeter = a + b + c;
            System.out.println("The perimeter is " + perimeter);
        } else {
            System.out.println("The input is invalid");
        }
    }
}

package chapter06;

import java.util.Scanner;

public class Exercise19 {

    public static boolean isValidTriangle (double side1, double side2, double side3){
        if (side1 + side2 < side3) {
            return false;
        }
        if (side1 + side3 < side2) {
            return false;
        }
        if (side2 + side3 < side1) {
            return false;
        }
        return true;
    }

    public static double area (double side1, double side2, double side3){
        double semiPerimeter = (side1 + side2 + side3) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a side A of triangle: ");
        double a = scanner.nextDouble();
        System.out.print("Enter a side B of triangle: ");
        double b = scanner.nextDouble();
        System.out.print("Enter a side C of triangle: ");
        double c = scanner.nextDouble();

        boolean isValid = isValidTriangle(a,b,c);
        if (isValid){
            double area = area(a,b,c);
            System.out.printf("The area of triangle is %5.2f", area);
        } else {
            System.out.println("This triangle is not valid");
        }
    }
}

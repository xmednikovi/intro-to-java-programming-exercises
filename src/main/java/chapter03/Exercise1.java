package chapter03;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a,b,c");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();


        double discriminant = Math.pow(b, 2) - 4 * a * c;
        if (discriminant > 0) {

            double x1 = (-b + Math.pow(discriminant, 0.5)) / 2*a;
            double x2 = (-b - Math.pow(discriminant, 0.5)) / 2*a;
            System.out.println("The roots are " + x1 + ", " + x2);

        } else if (discriminant == 0) {
            double x = (-b + Math.pow(discriminant, 0.5)) / 2*a;
            System.out.println("The root is "  + x);
        } else {
            System.out.println("This equation does not have any roots");
        }
    }
}

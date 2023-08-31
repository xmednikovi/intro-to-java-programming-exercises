package chapter12.exercise05;

import java.util.Scanner;

public class Exercise05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three sides of triangle: ");
        try {
            double side1 = scanner.nextDouble();
            double side2 = scanner.nextDouble();
            double side3 = scanner.nextDouble();

            Triangle triangle = new Triangle(side1, side2, side3);

            System.out.format("Area of triangle is %.3f and perimeter is %.3f", triangle.getArea(),
                    triangle.getPerimeter());
        } catch (IllegalTriangleException ex){
            System.out.println("Sum of two sides is greater than other!");
        }
    }
}

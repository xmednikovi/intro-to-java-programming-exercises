package chapter11.exercise01;

import java.util.Scanner;

public class Exercise01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a color for the triangle: ");
        String color = scanner.nextLine();
        System.out.print("Should the triangle be filled? 1-yes, 0-no: ");
        int filledChoice = scanner.nextInt();
        boolean filled = filledChoice == 1;
        System.out.print("Enter 3 sides of the triangle: ");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setFilled(filled);
        triangle.setColor(color);

        System.out.println(triangle);
        System.out.println(triangle.isFilled());
        System.out.println(triangle.getColor());

        System.out.println("Area is = " + triangle.getArea());
        System.out.println("Perimeter is = " + triangle.getPerimeter());
    }
}

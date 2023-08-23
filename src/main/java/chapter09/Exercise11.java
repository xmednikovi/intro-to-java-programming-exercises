package chapter09;

import java.util.Scanner;

public class Exercise11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        System.out.print("Enter d: ");
        double d = scanner.nextDouble();

        System.out.print("Enter e: ");
        double e = scanner.nextDouble();

        System.out.print("Enter f: ");
        double f = scanner.nextDouble();

        LinearEquation lq = new LinearEquation(a, b, c, d, e, f);
        if (lq.isSolvable()) {
            double x = lq.getX();
            double y = lq.getY();
            System.out.printf("X is %.2f, Y is %.2f\n", x, y);
        } else {
            System.out.println("This equation does not have any roots");
        }
    }
}

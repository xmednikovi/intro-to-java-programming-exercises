package chapter09;

import java.util.Scanner;

public class Exercise10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        double discriminant = quadraticEquation.getDiscriminant();

        if (discriminant > 0){
            double root1 = quadraticEquation.getRoot1();
            double root2 = quadraticEquation.getRoot2();
            System.out.printf("The root 1 is: %.1f, the root 2 is: %1f\n", root1, root2);
        } else if (discriminant == 0) {
            double root1  = quadraticEquation.getRoot1();
            System.out.printf("The root is: %.1f\n", root1);
        } else {
            System.out.println("This equation does not have any roots");
        }
    }
}

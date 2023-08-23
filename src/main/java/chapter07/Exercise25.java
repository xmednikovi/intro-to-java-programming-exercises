package chapter07;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise25 {

    public static int solveQuadratic (double[] eqn, double[] roots) {
        // check coeffecients
        double a = eqn[0];
        double b = eqn[1];
        double c = eqn[2];

        // find discriminant
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        int numberOfRoots;
        // check number of roots
        if (discriminant > 0) {
            numberOfRoots = 2;
        } else if (discriminant == 0) {
            numberOfRoots = 1;
        } else {
            numberOfRoots = 0;
        }

        // find roots
        if (numberOfRoots == 2) {
            roots[0] = (-b + Math.sqrt(discriminant)) / (2*a);
            roots[1] = (-b - Math.sqrt(discriminant)) / (2*a);
        } else if (numberOfRoots == 1) {
            roots[0] = (-b + Math.sqrt(discriminant)) / (2*a);
        }

        return numberOfRoots;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] roots = new double[2];
        double[] eqs = new double[3];

        for (int i = 0; i<3; i++){
            System.out.print("Enter a coefficent " + (i+1)+ ":");
            double eq = scanner.nextDouble();
            eqs[i] = eq;
        }

        int numberOfRoots = solveQuadratic(eqs, roots);
        if (numberOfRoots == 2) {
            System.out.println(Arrays.toString(roots));
        } else if (numberOfRoots == 1){
            System.out.println(roots[0]);
        } else{
            System.out.println("The equation has no real roots");
        }
    }
}

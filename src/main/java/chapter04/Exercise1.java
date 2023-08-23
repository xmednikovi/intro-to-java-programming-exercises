package chapter04;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a length from the center to a vertex:");
        double length = input.nextDouble();
        double side = 2 * length * Math.sin(Math.PI/ 5);
        double area = (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI/5));
        System.out.printf("The area of the pentagoin is %5.2f\n", area);
    }
}

package chapter03;

import java.util.Scanner;

public class Exercise22 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        double distance = Math.pow(Math.pow(x - 0, 2) + Math.pow(y - 0, 2),0.5);
        if (distance <= 10) {
            System.out.println("In the circle");
        } else {
            System.out.println("Is not in the circle");
        }
    }
}

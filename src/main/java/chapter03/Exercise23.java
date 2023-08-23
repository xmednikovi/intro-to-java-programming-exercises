package chapter03;

import java.util.Scanner;

public class Exercise23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        if ( (x >= -5 && x<= 5) && (y >= -2.5 && y <= 2.5) ){
            System.out.println("Is in the rectangle");
        } else {
            System.out.println("Is not in the rectangle");
        }
    }
}

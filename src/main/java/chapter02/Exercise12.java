package chapter02;

import java.util.Scanner;

public class Exercise12 {

    public static void main(String[] args){
        System.out.print("Please enter speed and acceleration:");
        Scanner input = new Scanner(System.in);
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();

        double length = Math.pow(speed, 2) / (2 * acceleration);

        System.out.println("The minimum runaway length is " + length);
    }
}

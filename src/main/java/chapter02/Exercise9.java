package chapter02;

import java.util.Scanner;

public class Exercise9 {

    public static void main(String[] args){
        System.out.print("Please enter v0, v1 and t:");
        Scanner input = new Scanner(System.in);
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();

        double acceleration = (v1 - v0) / t;

        System.out.println("The acceleration is " + acceleration);
    }
}

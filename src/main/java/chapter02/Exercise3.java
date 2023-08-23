package chapter02;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args){
        final double FEET_IN_METER = 3.2786;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number of meters: ");
        double meters = input.nextDouble();
        double feet = meters * FEET_IN_METER;
        System.out.println(meters + " meters is " + feet + " feet");
    }
}

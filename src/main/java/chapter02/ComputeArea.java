package chapter02;

import java.util.Scanner;

public class ComputeArea {

    public static void main(String[] args){
        double radius, area;
        // read radius
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a radius");
        radius = input.nextDouble();

        // compute area
        area = radius * radius * 3.14159;

        // display result
        System.out.println("The area of circle with radius " + radius + " is " + area);
    }
}

package chapter02;

import java.util.Scanner;

public class ComputeAreaWithConstant {

    public static void main(String[] args){
        final double PI = 3.14159d;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a radius: ");
        double radius = input.nextDouble();
        double area = radius * radius * PI;

        System.out.println("The area for circle is: " + area);
    }
}

package chapter02;

import java.util.Scanner;

public class Exercise16 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the side: ");
        double length = input.nextDouble();
        double area = (3 * Math.sqrt(3) * Math.pow(length, 2)) / 2;
        System.out.println("The area is: " + area);
    }
}

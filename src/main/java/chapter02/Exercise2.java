package chapter02;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter length of sides: ");
        double lengthOfSides = input.nextDouble();

//        double area = (Math.sqrt(3) * Math.pow(lengthOfSides, 2)) / 4;
        double area =(Math.sqrt(3)/4)*(lengthOfSides * lengthOfSides);
        double volume = area * lengthOfSides;

        System.out.println("Area is: " + area);
        System.out.println("Volume is: " + volume);
    }
}

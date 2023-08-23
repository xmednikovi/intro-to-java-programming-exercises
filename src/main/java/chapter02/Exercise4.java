package chapter02;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number in square meters");
        double meters = scanner.nextDouble();
        double pings = 0.3025 * meters;
        System.out.println(meters + " sq meters is " + pings + " pings");
    }
}

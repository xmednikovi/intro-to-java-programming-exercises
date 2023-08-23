package chapter03;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);
        int c = (int) (Math.random() * 10);
        System.out.print("Please multiply " + a + "x" + b + "x" + c + "=");
        Scanner input = new Scanner(System.in);
        int result = input.nextInt();
        if (result == a * b * c) {
            System.out.println("Correct!");
        } else {
            System.out.println("Sorry! The correct result is " + a*b*c);
        }
    }
}

package chapter05;

import java.util.Scanner;

public class SentinelValue {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.print("Please enter a number or -1 to finish:");
        int data = input.nextInt();
        while (data != -1) {
            sum += data;
            System.out.print("Please enter a number or -1 to finish:");
            data = input.nextInt();
        }
        System.out.println("You finished! The sum is " + sum);
    }
}

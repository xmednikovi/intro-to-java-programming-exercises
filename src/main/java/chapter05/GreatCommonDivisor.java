package chapter05;

import java.util.Scanner;

public class GreatCommonDivisor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number 1: ");
        int number1 = input.nextInt();
        System.out.print("Please enter the number 2: ");
        int number2 = input.nextInt();
        int gcd = 1;
        int k = 2;
        while (k <= number1 && k <= number2){
            if (number1 % k == 0 && number2 % k == 0) {
                gcd = k;
            }
            k++;
        }
        System.out.printf("The great common divisor of %d and %d is %d", number1, number2, gcd);
    }
}

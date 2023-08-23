package chapter06;

import java.util.Scanner;

public class Exercise02 {

    public static int sumDigits(long number){
        int sum = 0;
        do {
            int digit = (int) number % 10;
            sum += digit;
            number /= 10;
        } while (number != 0);
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        long number = scanner.nextLong();
        int sumOfDigits = sumDigits(number);
        System.out.printf("The sum of digits of %d is %d", number, sumOfDigits);
    }
}

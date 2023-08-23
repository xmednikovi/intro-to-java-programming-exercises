package chapter06;

import java.util.Scanner;

public class Exercise04 {

    public static int reverse(int number){
        String reverse = "";
        do {
            int digit = number % 10;
            reverse += digit;
            number /= 10;
        } while (number > 0);
        return Integer.parseInt(reverse);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number:");
        int number = scanner.nextInt();
        int result = reverse(number);
        System.out.printf("The reverse for the %s is %s", number, result);
    }
}

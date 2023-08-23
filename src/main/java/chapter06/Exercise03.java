package chapter06;

import java.util.Scanner;

public class Exercise03 {

    public static int reverse(int number){
        String s = Integer.toString(number);
        StringBuilder sb = new StringBuilder(s);
        return Integer.parseInt(sb.reverse().toString());
    }

    public static boolean isPalindrome(int number){
        String s1 = Integer.toString(number);
        String s2 = Integer.toString(reverse(number));
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number:");
        int number = scanner.nextInt();
        boolean result = isPalindrome(number);
        if (result) {
            System.out.println("The number is palindrome");
        } else {
            System.out.println("The number is not palindrome");
        }
    }
}

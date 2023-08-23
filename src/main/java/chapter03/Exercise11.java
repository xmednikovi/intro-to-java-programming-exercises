package chapter03;

import java.util.Scanner;

public class Exercise11 {

    public static boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 ==0);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter year: ");
        int year = input.nextInt();

        System.out.print("Please enter month: ");
        int month = input.nextInt();

        if (month == 2) {
            if (isLeapYear(year)) {
                System.out.println("29 days");
            } else {
                System.out.println("28 days");
            }
        } else {
            if (month == 4 || month == 6 || month == 9 || month == 11){
                System.out.println("30 days");
            } else {
                System.out.println("31 days");
            }
        }
    }
}

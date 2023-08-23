package chapter04;

import java.util.List;
import java.util.Scanner;

public class Exercise17 {

    public static boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 ==0);
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        System.out.print("Please enter year: ");
//        int year = input.nextInt();

        System.out.print("Please enter month: ");
        String month = input.nextLine();

        System.out.print("Please enter year: ");
        int year = input.nextInt();

        if (month.length() > 3) {
            System.out.println("Invalid input");
            System.exit(1);
        }

        if (month.equalsIgnoreCase("feb")) {
            if (isLeapYear(year)) {
                System.out.println("29 days");
            } else {
                System.out.println("28 days");
            }
        } else {
            List<String> months = List.of("apr", "jun", "sep", "nov");
            if (months.contains(month.toLowerCase())){
                System.out.println("30 days");
            } else {
                System.out.println("31 days");
            }
        }
    }
}

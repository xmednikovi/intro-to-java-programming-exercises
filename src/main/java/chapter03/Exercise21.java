package chapter03;

import java.util.Scanner;

public class Exercise21 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = input.nextInt();
        System.out.print("Enter month 1-12: ");
        int month = input.nextInt();
        System.out.print("Enter day of month 1-31: ");
        int day = input.nextInt();

        if (month == 1 || month == 2 ){
            year --;
            month += 12;
        }

        int yearInCentery = year % 100;

        int dayOfWeek = ( day + (26*(month+1))/10 + yearInCentery + yearInCentery/4 + year/400 + 5*(year/100) ) % 7;

        switch (dayOfWeek) {
            case 0:
                System.out.println("Saturday");
                break;
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
        }


    }
}

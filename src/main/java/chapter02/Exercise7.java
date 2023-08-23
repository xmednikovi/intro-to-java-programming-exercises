package chapter02;

import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] args){
        System.out.print("Please enter number of minutes");

        Scanner input = new Scanner(System.in);
        long minutes = input.nextLong();

        long years = 365 * 24 * 60;

        long yearsInMinutes = minutes / years;
        long remainingDays = (minutes % years) / (24 * 60);

        System.out.println(yearsInMinutes + " years and " + remainingDays + " days");
    }
}

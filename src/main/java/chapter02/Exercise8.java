package chapter02;

import java.util.Scanner;

public class Exercise8 {

    public static void main(String[] args){
        System.out.print("Please enter an offset");
        Scanner input = new Scanner(System.in);
        int offset = input.nextInt();

        long totalMilliseconds = System.currentTimeMillis();

        // total seconds
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;

        // total minutes
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;

        // total hours
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        currentHour += offset;

        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }
}

package chapter09;

import java.util.Date;

public class Exercise03 {

    public static void displayDate(long elapsedTime){
        Date date = new Date(elapsedTime);
        System.out.println("Datetime for " + elapsedTime + " milliseconds is " + date.toString());
    }

    public static void main(String[] args) {
        displayDate(10000);
        displayDate(100000);
        displayDate(1000000);
        displayDate(10000000);
        displayDate(100000000);
        displayDate(1000000000);
        displayDate(10000000000L);
        displayDate(100000000000L);
    }
}

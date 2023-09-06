package chapter06;

import java.util.Scanner;

public class Exercise25 {

    public static String convertMills (long mills){
        int seconds = (int) (mills / 1000) % 60;
        int minutes = (int) ( (mills / (1000*60)) % 60);
        int hours = (int) ( (mills / (1000*60*60)) % 24);
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter milliseconds: ");
        long milliseconds = scanner.nextLong();
        String result = convertMills(milliseconds);
        System.out.println(result);
    }
}

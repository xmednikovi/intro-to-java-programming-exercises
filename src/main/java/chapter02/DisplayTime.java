package chapter02;

import java.util.Scanner;

public class DisplayTime {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter seconds: ");
        int seconds = input.nextInt();
        int munutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        System.out.println(seconds + " seconds is " + munutes + " min and " + remainingSeconds +" seconds");
    }
}

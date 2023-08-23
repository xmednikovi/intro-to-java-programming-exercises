package chapter05;

import java.util.Scanner;

public class Dec2Hex {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = input.nextInt();
        String result = "";

        while (decimal != 0) {
            int hex = decimal % 16;
            char hexDigit = (hex>=0 && hex <=9) ? (char) (hex + '0') : (char) (hex-10+'A');
            result = hexDigit + result;
            decimal = decimal / 16;
        }
        System.out.println("The hex number is " + result);
    }
}

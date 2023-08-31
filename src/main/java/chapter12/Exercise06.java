package chapter12;

import java.util.Scanner;

public class Exercise06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter hex number: ");
        String input = scanner.nextLine();
        try {
            int num = Integer.parseInt(input, 16);
            System.out.println("The hex " + input + " is dec " + num);
        } catch (NumberFormatException ex){
            System.out.println("The number is not in hex format!");
        }
    }
}

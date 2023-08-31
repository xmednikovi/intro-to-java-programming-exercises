package chapter12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise03 {

    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner scanner = new Scanner(System.in);


        try {
            System.out.print("Enter month 1-12: ");
            int input = scanner.nextInt();

            String month = months[input - 1];
            int days = dom[input - 1];
            System.out.println(month +" has " + days + " days");
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Wrong number!");
        } catch (InputMismatchException ex){
            System.out.println("You need to enter an integer!");
        }
    }
}

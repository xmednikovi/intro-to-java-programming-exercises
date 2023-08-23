package chapter04;

import java.util.Scanner;

public class Exercise18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String s = input.nextLine();

        char major = s.charAt(0);
        char year = s.charAt(1);

        if (major == 'I') {
            System.out.print("\nInformation Management ");
        } else if (major == 'C') {
            System.out.print("\nComputer Science ");
        } else if (major == 'A') {
            System.out.print("\nAccounting ");
        } else {
            System.out.println("Invalid input");
            System.exit(1);
        }

        if (year == '1') {
            System.out.print("Freshman");
        } else if (year == '2'){
            System.out.print("Sophomore");
        } else if (year == '3'){
            System.out.print("Junior");
        } else {
            System.out.print("Senior");
        }

    }
}

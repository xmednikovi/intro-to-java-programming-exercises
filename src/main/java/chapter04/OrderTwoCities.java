package chapter04;

import java.util.Scanner;

public class OrderTwoCities {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        String city1 = input.nextLine();
        System.out.print("Enter the second city: ");
        String city2 = input.nextLine();

        System.out.println("The cities in an alphabetical order are: ");
        if (city1.compareTo(city2) < 0) {
            System.out.println(city1 + " " + city2);
        } else {
            System.out.println(city2 + " " + city1);
        }
    }
}

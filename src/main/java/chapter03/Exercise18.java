package chapter03;

import java.util.Scanner;

public class Exercise18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the weight of shipping: ");
        double weight = input.nextDouble();

        if (weight > 0 && weight <= 2.0){
            System.out.println("The price is 2.5");
        } else if (weight > 2.0 && weight <= 4.0){
            System.out.println("The price is 4.5");
        } else if (weight > 4.0 && weight <= 10.0) {
            System.out.println("The price is 7.5");
        } else if (weight > 10 && weight <= 20.0) {
            System.out.println("The price is 10.5");
        } else {
            System.out.println("The package cannot be delivered");
        }
    }
}

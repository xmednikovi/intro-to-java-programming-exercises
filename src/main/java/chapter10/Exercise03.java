package chapter10;

import java.util.Scanner;

public class Exercise03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        String number = scanner.nextLine();
        MyInteger myInteger = new MyInteger(MyInteger.parseInt(number));
        System.out.println("This number is even: " + myInteger.isEven());
        System.out.println("This number is odd: " + myInteger.isOdd());
        System.out.println("This number is prime: " + myInteger.isPrime());
    }
}

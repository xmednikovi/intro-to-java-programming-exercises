package chapter05;

import java.util.Random;
import java.util.Scanner;

public class GuessNumbers {

    public static void main(String[] args) {
        Random random = new Random();
        int number = random.ints(1, 12).findFirst().getAsInt();
        Scanner input = new Scanner(System.in);
        System.out.print("Guess the number between 1 and 11:");
        int answer = input.nextInt();
        while (answer!=number){
            if (answer > number) {
                System.out.println("Too high! Try again: ");
                answer = input.nextInt();
            } else {
                System.out.println("Too low! Try again:");
                answer = input.nextInt();
            }
        }
        System.out.println("Correct!");
    }
}

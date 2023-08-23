package chapter03;

import java.util.Random;
import java.util.Scanner;

public class Exercise14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int number = random.ints(0, 2).findFirst().getAsInt();

        System.out.print("Guess 0 or 1? ");
        int guess = input.nextInt();

        if (guess == number){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

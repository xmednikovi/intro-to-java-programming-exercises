package chapter03;

import java.util.Random;
import java.util.Scanner;

public class Exercise17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int value = random.ints(0, 3).findFirst().getAsInt();

        System.out.print("Enter  scissor (0), rock (1), paper (2): ");
        int answer = input.nextInt();

        if (answer == 0 && value == 2) {
            System.out.println("You won! The computer is paper. Scissor cuts paper");
        } else if (answer == 0 && value == 1){
            System.out.println("You lose! The computer is rock. Rock destroys scissor");
        } else if (answer == 0 && value == 0) {
            System.out.println("Nothing. The computer is scissor as well");
        } else if (answer == 1 && value == 2) {
            System.out.println("You lose. The computer is paper. Paper can wrap a rock");
        } else if (answer == 1 && value == 1){
            System.out.println("Nothing. The computer is rock too");
        } else if (answer == 1 && value == 0){
            System.out.println("You won! The computer is scissor. Rock destroys scissor");
        } else if (answer == 2 && value == 2){
            System.out.println("Nothing. The computer is paper too");
        } else if (answer == 2 && value == 1){
            System.out.println("You win. The computer is paper. Paper can wrap a rock");
        } else {
            System.out.println("You lose. The computer is scissor and cuts you");
        }



    }
}

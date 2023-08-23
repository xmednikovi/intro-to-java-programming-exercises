package chapter05;

import java.util.Scanner;

public class Exercise01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("Please enter the score or -1 to exit: ");
//        int answer = input.nextInt();
//        while (answer != -1){
//            if (answer < 60) {
//                System.out.println("You fail the exam");
//            } else {
//                System.out.println("You pass the exam");
//            }
//            System.out.print("Please enter the score or -1 to exit: ");
//            answer = input.nextInt();
//        }

        int answer = 0;
        do {
            System.out.print("Please enter the score or -1 to exit: ");
            answer = input.nextInt();
            if (answer < 60) {
                System.out.println("You fail the exam");
            } else {
                System.out.println("You pass the exam");
            }
        } while (answer != -1);
    }
}

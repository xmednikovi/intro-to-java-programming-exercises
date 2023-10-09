package chapter19.exercise05;

import java.util.Scanner;

public class Exercise05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1:");
        int x1 = scanner.nextInt();

        System.out.print("Enter number 2:");
        int x2 = scanner.nextInt();

        System.out.print("Enter number 3:");
        int x3 = scanner.nextInt();

        Triplet<Integer> triplet = new Triplet<>(x1, x2, x3);

        System.out.printf("Values in triplet: %d, %d, %d", triplet.getT1(), triplet.getT2(), triplet.getT3());
    }
}

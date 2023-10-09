package chapter19.exercise03;

import java.util.Scanner;

public class Exercise03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1:");
        int x1 = scanner.nextInt();

        System.out.print("Enter number 2:");
        int x2 = scanner.nextInt();

        Pair<Integer> pair = new Pair<>(x1, x2);

        System.out.printf("Values in pair: %d, %d", pair.getT1(), pair.getT2());
    }
}

package chapter06;

import java.util.Random;
import java.util.Scanner;

public class Exercise17 {

    public static void printMatrix(int n){
        Random random = new Random();
        for (int row = 0; row < n; row ++){
            for (int column = 0; column < n; column ++){
                int number = random.nextInt(0, 2);
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        printMatrix(n);
    }
}

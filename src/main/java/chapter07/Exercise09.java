package chapter07;

import java.util.Scanner;

public class Exercise09 {

    public static double max (double[] numbers){
        double currentMax = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            double n = numbers[i];
            if (n > currentMax) {
                currentMax = n;
            }
        }
        return currentMax;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] arr = new double[10];
        for (int i = 0; i < 10; i ++) {
            System.out.printf("Enter the number %d: ", i+1);
            arr[i] = scanner.nextDouble();
        }

        double max = max(arr);
        System.out.println("The max is: " + max);
    }
}

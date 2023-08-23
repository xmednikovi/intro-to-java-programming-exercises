package chapter07;

import java.util.Scanner;

public class Exercise08 {

    public static int average (int[] numbers) {
        System.out.println("Integer version is executed");
        int sum = 0;
        for (int i = 0; i < numbers.length; i ++) {
            sum += numbers[i];
        }
        return sum / numbers.length;
    }

    public static double average (double[] numbers) {
        System.out.println("Double version is executed");
        double sum = 0;
        for (int i = 0; i < numbers.length; i ++) {
            sum += numbers[i];
        }
        return sum / numbers.length;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] arr = new double[10];
        for (int i = 0; i < 10; i ++) {
           System.out.printf("Enter the number %d: ", i+1);
           arr[i] = scanner.nextDouble();
        }

        double average = average(arr);
        System.out.println("The average is: " + average);
    }
}

package chapter07;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise12 {

    public static void reverse(double[] initial, double[] result, int length){
        for (int i = 0, y = length - 1; i < length; i ++, y--){
            double number = initial[i];
            result[y] = number;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] arr = new double[10];
        for (int i = 0; i < 10; i ++) {
            System.out.printf("Enter the number %d: ", i+1);
            arr[i] = scanner.nextDouble();
        }
        System.out.println("Normal array");
        System.out.println(Arrays.toString(arr));

        double[] reversedArray = new double[10];
        reverse(arr, reversedArray, 10);
        System.out.println("Reversed array");
        System.out.println(Arrays.toString(reversedArray));

    }
}

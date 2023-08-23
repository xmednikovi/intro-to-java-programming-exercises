package chapter07;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise10 {

    public static int indexOfLargestElement(double[] numbers) {
        int indexOfLargest = 0;
        double largest = numbers[indexOfLargest];

        for (int i = 1; i < numbers.length; i ++) {
            double number = numbers[i];
            if (number > largest) {
                largest = number;
                indexOfLargest = i;
            } else if (number == largest) {
                indexOfLargest = i;
            } else {
                continue;
            }
        }

        return indexOfLargest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] arr = new double[10];
        for (int i = 0; i < 10; i ++) {
            System.out.printf("Enter the number %d: ", i+1);
            arr[i] = scanner.nextDouble();
        }

        System.out.println(Arrays.toString(arr));

        int indexOfMax = indexOfLargestElement(arr);
        System.out.println("The index is: " + indexOfMax);
    }
}

package chapter07;

import java.util.Arrays;

public class SelectionSort {

    public static void sort(int[] numbers) {

        for (int i = 0; i< numbers.length; i++){
            int currentMin = numbers[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (currentMin > numbers[j]) {
                    currentMin = numbers[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                numbers[currentMinIndex] = numbers[i];
                numbers[i] = currentMin;
            }
        }

    }

    public static void main(String[] args) {
        int[] numbers = {2, 9, 5, 4, 8, 1, 6};
        System.out.println("Original array: " + Arrays.toString(numbers));
        sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
}

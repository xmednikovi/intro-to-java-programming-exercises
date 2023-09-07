package chapter07;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise15 {

    public static void printArray (int[] arr){
        Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
    }

    public static boolean isInArray(int[] arr, int value){
        return Arrays.stream(arr).filter(i -> i==value).findFirst().isPresent();
    }

    public static int[] eliminateDuplicates(int[] arr){
        return Arrays.stream(arr).distinct().toArray();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        // read numbers
        for (int i = 0; i < 10; i ++) {
            System.out.print("Please enter a number: ");
            int input = scanner.nextInt();
            numbers[i] = input;
        }

        // print numbers
        System.out.println("Displaying numbers: ");
        printArray(numbers);

        System.out.println("Eliminating duplicates");
        int[] noDuplicates = eliminateDuplicates(numbers);
        printArray(noDuplicates);
    }
}

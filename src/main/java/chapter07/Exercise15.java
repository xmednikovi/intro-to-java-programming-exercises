package chapter07;

import java.util.Scanner;

public class Exercise15 {

    public static void printArray (int[] arr){
        for (int i = 0; i < arr.length; i++){
            int current = arr[i];
            if (current > 0) {
                System.out.print(current + " ");
            }
        }
    }

    public static boolean isInArray(int[] arr, int value){
        for (int i = 0; i<arr.length; i++){
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }

    public static int[] eliminateDuplicates(int[] arr){
        int[] result = new int[arr.length];
        int nextPosition = 0;
        for (int i = 0; i < arr.length ; i ++){
            // get current number
            int currentNumber = arr[i];
            // if result does not contain currentNumber -> add
            // else -> continue
            if (isInArray(result, currentNumber) == false){
                result[nextPosition] = currentNumber;
                nextPosition ++;
            }
        }
        return result;
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

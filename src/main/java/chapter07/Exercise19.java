package chapter07;

import java.util.Scanner;

public class Exercise19 {

    public static boolean isSorted (int[] arr){
        int size = arr.length;
        for (int i = 0; i< size - 1; i++) {
            int a = arr[i];
            int b = arr[i+1];
            if (a < b) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size of list: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i ++){
            int input = scanner.nextInt();
            arr[i] = input;
        }

        boolean result = isSorted(arr);
        if (result) {
            System.out.println("The array is already sorted");
        } else {
            System.out.println("The array is not sorted");
        }
    }
}

package chapter07;

import java.util.Scanner;

public class Exercise26 {

    public static boolean isSorted(int[] arr){
        int length = arr.length;
        for (int i = 0; i < length - 1; i ++){
            int x = arr[i];
            int y = arr[i + 1];
            if (x > y) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size of an array:");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++ ){
            int next = scanner.nextInt();
            numbers[i] = next;
        }

        boolean sorted = isSorted(numbers);
        if (sorted){
            System.out.println("The array is sorted");
        } else {
            System.out.println("The array is not sorted");
        }
    }
}

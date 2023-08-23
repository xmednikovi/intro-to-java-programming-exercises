package chapter07;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise20 {

    // descending
    public static void bubbleSort(int[] arr){
        int size = arr.length;
        int temp;

        for (int i = 0; i < size - 1; i++){
            // inner loop
            for (int y = 0; y < size - i - 1; y++){
                if (arr[y] < arr[y + 1]){
                    // swap
                    temp = arr[y];
                    arr[y] = arr[y+1];
                    arr[y+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];

        // read
        for (int i = 0; i < 10; i ++){
            System.out.print("Enter a number: ");
            int input = scanner.nextInt();
            arr[i] = input;
        }

        //do bubble sort
        bubbleSort(arr);

        // display
        System.out.println(Arrays.toString(arr));
    }
}

package chapter08;

import java.util.Arrays;
import java.util.Random;

public class Exercise10 {

    public static int getRandomValue() {
        Random random = new Random();
        return random.nextInt(0, 2);
    }

    public static void printMatrix(int[][] arr, int n){
        for (int i = 0; i < n; i ++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static void fillMatrix(int[][] arr, int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j ++){
                arr[i][j] = getRandomValue();
            }
        }
    }

    public static int findLargestRow(int[][] arr){
        int largestRowNumber = 0;
        int largestSum = 0;
        for (int i = 0; i < 5; i ++){
            int sum = 0;
            for (int j = 0; j < 5; j++){
                sum += arr[i][j];
            }
            if (sum > largestSum) {
                largestSum = sum;
                largestRowNumber = i;
            }
        }
        return largestRowNumber;
    }

    public static int findLargestColumn(int[][] arr){
        int largestColumnNumber = 0;
        int largestSum = 0;

        for (int i = 0; i < 5; i ++){
            int sum = 0;
            for (int j = 0; j < 5; j++){
                sum += arr[j][i];
            }
            if (sum > largestSum) {
                largestSum = sum;
                largestColumnNumber = i;
            }
        }


        return largestColumnNumber;
    }

    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        fillMatrix(arr, 5);
        int largestRowNumber = findLargestRow(arr);
        int largestColumnNumber = findLargestColumn(arr);
        printMatrix(arr, 5);
        System.out.println("The largest row is " + largestRowNumber);
        System.out.println("The largest column is " + largestColumnNumber);
    }
}

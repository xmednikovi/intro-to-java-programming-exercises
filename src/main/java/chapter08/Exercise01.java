package chapter08;

import java.util.Scanner;

public class Exercise01 {

    public static double sumRow(double[][] arr, int row){
        double result = 0;
        for (int i = 0; i < arr[row].length; i ++) {
            result += arr[row][i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] arr = new double[3][4];
        // read input
        System.out.print("Enter a 3−by−4 matrix row by row:");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                arr[i][j] = scanner.nextDouble();
            }
        }

        // sum
        for (int i = 0; i < 3; i++){
            double sum = sumRow(arr, i);
            System.out.printf("The sum of row %d is %5.2f\n", i, sum);
        }
    }
}

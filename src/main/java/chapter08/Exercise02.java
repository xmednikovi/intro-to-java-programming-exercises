package chapter08;

import java.util.Scanner;

public class Exercise02 {

    public static double averageMajorDiagonal(double[][] arr, int n) {
        double sum = 0;
        for (int i = 0; i < n; i ++){
            sum += arr[i][i];
        }
        return sum / n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 4-by-4 matrix row by row: ");
        double[][] arr = new double[4][4];
        for (int i = 0; i < 4; i ++) {
            for (int j = 0; j < 4 ; j++){
                arr[i][j] = scanner.nextDouble();
            }
        }

        double result = averageMajorDiagonal(arr, 4);
        System.out.println("The average major diagonal is : " + result);
    }
}

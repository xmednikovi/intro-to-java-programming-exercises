package chapter08;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise05 {

    public static void displayMatrix (double[][] arr){
        for (int i = 0; i < 2; i ++){
            System.out.println(Arrays.toString(arr[i]));

        }
    }

    public static double[][] addMatrices(double[][] a, double[][] b){
        double[][] result = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++){
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    public static void readMatrix(Scanner scanner, double[][] arr){
        for (int i = 0; i < 2; i ++){
            for (int j = 0; j < 2; j ++){
                arr[i][j] = scanner.nextDouble();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] matrix1 = new double[2][2];
        double[][] matrix2 = new double[2][2];
        System.out.print("Enter matrix 1:");
        readMatrix(scanner, matrix1);
        System.out.println("Enter matrix 2:");
        readMatrix(scanner, matrix2);
        double[][] sum = addMatrices(matrix1, matrix2);

        displayMatrix(sum);
    }
}

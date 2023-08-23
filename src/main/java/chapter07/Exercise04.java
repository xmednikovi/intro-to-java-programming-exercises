package chapter07;

import java.util.Scanner;

public class Exercise04 {

    public static double getAverage (int[] arr){
        int sum = 0;
        int length = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
            if (arr[i] != 0){
                length ++;
            }
        }
        return (double) sum / length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] scores = new int[100];

        System.out.print("Enter scores (no more than 100): ");
        int count = 0;
        int input;
        do {
            input = scanner.nextInt();
            scores[count] = input;
            count ++;
        } while (count < 100 && input > 0);

        double average = getAverage(scores);
        System.out.println("The average is: " + average);

        int bellowAverage = 0;
        int aboveAverage = 0;

        for (int i = 0; i < scores.length; i++){
            int score = scores[i];
            if (score == 0) {
                continue;
            }
            if (score > average) {
                aboveAverage ++;
            } else if (score < average) {
                bellowAverage ++;
            } else {
                continue;
            }
        }

        System.out.println("Scores below average: " + bellowAverage);
        System.out.println("Scores above average: " + aboveAverage);
    }
}

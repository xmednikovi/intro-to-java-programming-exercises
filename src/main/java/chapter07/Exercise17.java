package chapter07;

import java.util.Scanner;

public class Exercise17 {

    public static int findLargestIndex(int[] arr){
        int largest = arr[0];
        int largestIndex = 0;
        for (int i = 1; i < arr.length; i ++){
            int current = arr[i];
            if (current > largest) {
                largest = current;
                largestIndex = i;
            }
        }
        return largestIndex;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number of students: ");
        int numberOfStudents = scanner.nextInt();

        int[] scores = new int[numberOfStudents];
        String[] names = new String[numberOfStudents];

        // read input
        for (int i = 0; i < numberOfStudents; i ++){
            System.out.print("Enter a name: ");
            String name = scanner.next();
            System.out.print("Enter a score: ");
            int score = scanner.nextInt();

            scores[i] = score;
            names[i] = name;
        }

        for (int i = 0; i < numberOfStudents; i ++){
            // get index of largest score
            int indexOfLargestScore = findLargestIndex(scores);
            // get score
            int score = scores[indexOfLargestScore];

            // get name
            String name = names[indexOfLargestScore];

            // delete largest score from array
            scores[indexOfLargestScore] = 0;

            // print
            System.out.printf("%s has score %d\n", name, score);
        }

    }
}

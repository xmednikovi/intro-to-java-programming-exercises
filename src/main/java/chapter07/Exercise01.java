package chapter07;

import java.util.Scanner;

public class Exercise01 {

    public static char getGrade(int score, int bestScore){
        if (score >= bestScore - 5) {
            return 'A';
        } else if (score >= bestScore - 10){
            return 'B';
        } else if (score >= bestScore - 15){
            return 'C';
        } else if (score >= bestScore - 20){
            return 'D';
        } else {
            return 'F';
        }
    }

    public static int findBestScore(int[] scores){
        int best = scores[0];
        for (int i = 1; i < scores.length; i ++) {
           if (scores[i] > best) {
               best = scores[i];
           }
        }
        return best;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number of students: ");
        int numberOfStudents = scanner.nextInt();
        if (numberOfStudents == 0){
            System.out.println("Good bye");
            System.exit(0);
        }

        int[] scores = new int[numberOfStudents];

        System.out.println("Enter " + numberOfStudents + " scores");
        for (int i = 0; i < numberOfStudents; i ++) {
            int input = scanner.nextInt();
            scores[i] = input;
        }

        int bestScore = findBestScore(scores);

        for (int i = 0; i < scores.length; i ++) {
            int studentId = i + 1;
            char grade = getGrade(scores[i], bestScore);
            System.out.printf("Student %d has grade %c\n", studentId, grade);
        }

    }
}

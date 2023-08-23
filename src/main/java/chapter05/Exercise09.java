package chapter05;

import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number of students: ");
        int numberOfStudents = input.nextInt();
        if (numberOfStudents < 1) {
            System.out.println("Good bye!");
            System.exit(0);
        }

        int lowestScore = 5;
        int secondLowestScore = lowestScore;
        String lowestName = "";
        String secondLowestName = "";

        for (int i=0; i<numberOfStudents; i++) {
            System.out.print("Please enter the student name: ");
            String name = input.next();
            System.out.print("Please enter the score: ");
            int score = input.nextInt();

            if (score < lowestScore) {
                lowestScore = score;
                lowestName = name;
            }
            if (score > lowestScore && score < secondLowestScore){
                secondLowestName = name;
                secondLowestScore = score;
            }

        }

        System.out.println("The student with lowest score is " + lowestName);
        System.out.println("The student with 2nd lowest score is " + secondLowestName);
    }
}

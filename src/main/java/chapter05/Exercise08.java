package chapter05;

import java.util.Scanner;

public class Exercise08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number of students: ");
        int numberOfStudents = input.nextInt();
        int count = 0;
        int highestScore = 0;
        String highestName = "";

        if (numberOfStudents == 0) {
            System.out.println("Good bye!");
            System.exit(0);
        }
        do {
            System.out.print("Please enter a student name: ");
            String name = input.next();
            System.out.print("Please enter a score: ");
            int score = input.nextInt();
            if (score > highestScore) {
                highestScore = score;
                highestName = name;
            }
            count ++;
        } while (count < numberOfStudents);
        System.out.println("The student with highest score is " + highestName);
    }
}

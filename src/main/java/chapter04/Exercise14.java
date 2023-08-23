package chapter04;

import java.util.List;
import java.util.Scanner;

public class Exercise14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter grade: ");
        String grade = input.nextLine();
        List<String> grades = List.of("F", "D", "C", "B", "A");
        if (grades.contains(grade)){
            int position = grades.indexOf(grade);
            System.out.printf("The numeric value for grade %s is %d", grade, position);
        } else {
            System.out.printf("%s is an invalid input", grade);
        }
    }
}

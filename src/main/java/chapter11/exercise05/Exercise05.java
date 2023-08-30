package chapter11.exercise05;

import java.util.Arrays;

public class Exercise05 {

    public static void main(String[] args) {
        Course course = new Course("Mathematics 1");
        course.addStudent("Yuri");
        course.addStudent("Adriana");
        course.addStudent("Marko");
        course.addStudent("Diana");

        System.out.println("Number of students: " + course.getNumberOfStudents());
        course.dropStudent("Diana");
        System.out.println("Number of students: " + course.getNumberOfStudents());

        String[] enrolledStudents = course.getStudents();

        System.out.println(Arrays.toString(enrolledStudents));
    }
}

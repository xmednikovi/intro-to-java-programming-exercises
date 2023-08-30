package chapter10;

import java.util.Arrays;

public class Exercise09 {

    public static void main(String[] args) {
        // create a course
        Course course = new Course("Java 101");

        // add 3 students
        course.addStudent("Maria");
        course.addStudent("Aleksandar");
        course.addStudent("Petra");

        // remove one student
        course.dropStudent("Petra");

        // display students
        System.out.println(Arrays.toString(course.getStudents()));
    }
}

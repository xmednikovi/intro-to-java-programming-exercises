package chapter10;

import org.junit.Assert;
import org.junit.Test;

public class Exercise09Test {

    @Test
    public void addStudentTest(){
        Course course = new Course("Java 101");
        course.addStudent("Yuri");
        course.addStudent("Maria");
        course.addStudent("Anna");
        int numberOfStudents = course.getNumberOfStudents();
        Assert.assertEquals(3, numberOfStudents);
    }

    @Test
    public void dropStudentTest(){
        Course course = new Course("Java 101");
        course.addStudent("Yuri");
        course.addStudent("Maria");
        course.addStudent("Anna");
        course.dropStudent("Maria");
        int numberOfStudents = course.getNumberOfStudents();
        Assert.assertEquals(2, numberOfStudents);
    }

    @Test
    public void getStudentsTest(){
        Course course = new Course("Java 101");
        course.addStudent("Yuri");
        course.addStudent("Maria");
        course.addStudent("Anna");
        String[] students = course.getStudents();
        Assert.assertEquals(3, students.length);
    }

    @Test
    public void clearTest(){
        Course course = new Course("Java 101");
        course.addStudent("Yuri");
        course.addStudent("Maria");
        course.addStudent("Anna");
        course.clear();
        Assert.assertEquals(0, course.getNumberOfStudents());
    }
}

package chapter11.exercise05;

import java.util.ArrayList;

public class Course {

    private final String courseName;
    private final ArrayList<String> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public void addStudent(String student){
        this.students.add(student);
    }

    public void dropStudent(String student){
        this.students.remove(student);
    }

    public String getCourseName() {
        return courseName;
    }

    public String[] getStudents() {
        String[] tmp = new String[this.getNumberOfStudents()];
        tmp = this.students.toArray(tmp);
        return tmp;
    }

    public void clear() {
        this.students.clear();
    }

    public int getNumberOfStudents() {
        return this.students.size();
    }
}

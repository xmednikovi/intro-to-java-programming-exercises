package chapter10;

public class Course {

    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student){
        // default implementation
        // students[numberOfStudents] = student;
        //  numberOfStudents ++;

        // exercise 10.9
        if (numberOfStudents > this.students.length + 1){
            // create new array
            int length = this.students.length;
            String[] newArr = new String[length * 2];
            // copy
            System.arraycopy(this.students, 0, newArr, 0, length);
            this.students = newArr;

        }
        students[numberOfStudents] = student;
        numberOfStudents ++;
    }

    public void dropStudent(String student){
        for (int i = 0; i < this.students.length; i++){
            if (this.students[i].equals(student)) {
                this.students[i] = "";
                this.numberOfStudents --;
                break;
            }
        }

    }

    public String getCourseName() {
        return courseName;
    }

    public String[] getStudents() {
        if (this.students.length != numberOfStudents){
            String[] newArr = new String[numberOfStudents];
            System.arraycopy(this.students, 0, newArr, 0, numberOfStudents);
            return newArr;
        } else {
            return this.students;
        }
    }

    public void clear() {
        for (int i = 0; i < this.students.length; i ++) {
            this.students[i] = null;
        }

        this.numberOfStudents = 0;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }
}

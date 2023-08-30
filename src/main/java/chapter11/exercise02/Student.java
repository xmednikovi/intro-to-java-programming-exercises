package chapter11.exercise02;

public class Student extends Person {

    private int status;

    public Student(String name){
        super(name);
    }

    public Student(String name, int status){
        super(name);
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student: " + this.getName();
    }
}

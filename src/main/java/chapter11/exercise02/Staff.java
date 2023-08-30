package chapter11.exercise02;

public class Staff extends Employee{

    private String title;

    public Staff(String name){
        super(name);
    }

    public Staff(String name, String title) {
        super(name);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff: " + this.getName();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

package chapter11.exercise02;

public class Faculty extends Employee{

    private String officeHours;
    private String rank;

    public Faculty(String name){
        super(name);
    }

    public Faculty(String name, String officeHours, String rank) {
        super(name);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty: " + this.getName();
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}

package chapter12.exercise24;

import com.github.javafaker.Faker;

import java.util.Random;

public class FacultyMember {

    private static final Faker faker = new Faker();
    private static final Random random = new Random();

    private static final String[] RANKS = {
            "Assistant", "Associate", "Full"
    };

    private String firstName;
    private String lastName;
    private String rank;
    private int salary;


    public FacultyMember() {
        this.lastName = faker.name().lastName();
        this.firstName = faker.name().firstName();

        int rankNumber = random.nextInt(0, 3);
        this.rank = RANKS[rankNumber];

        if (rankNumber == 0) {
            this.salary = random.nextInt(50_000, 80_000);
        } else if (rankNumber == 1) {
            this.salary = random.nextInt(60_000, 110_000);
        } else {
            this.salary = random.nextInt(75_000, 130_000);
        }
    }

    public FacultyMember(String firstName, String lastName, String rank, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rank = rank;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

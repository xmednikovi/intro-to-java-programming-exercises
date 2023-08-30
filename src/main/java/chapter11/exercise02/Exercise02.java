package chapter11.exercise02;

public class Exercise02 {

    public static void printPerson (Person p){
        System.out.println(p);
    }

    public static void main(String[] args) {
        Person p = new Person("John");
        Person st = new Student("Margo");
        Person em = new Employee("Valeria");
        Employee ft = new Faculty("Dasha");
        Employee sf = new Faculty("Herbert");

        printPerson(p);
        printPerson(st);
        printPerson(em);
        printPerson(ft);
        printPerson(sf);
    }
}

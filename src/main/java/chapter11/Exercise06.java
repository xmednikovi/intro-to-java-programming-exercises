package chapter11;

import chapter10.Circle2D;
import chapter11.exercise02.Student;

import java.util.ArrayList;
import java.util.Date;

public class Exercise06 {

    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();

        objects.add(new Date());
        objects.add(new Circle2D(10, 12, 8));
        objects.add(new Student("Iurii Mednikov"));

        for (Object o: objects){
            System.out.println(o);
        }
    }
}

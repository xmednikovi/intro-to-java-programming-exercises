package chapter17;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Exercise05 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        Date date = new Date();
        double value = 10.5;

        try (FileOutputStream fileOutputStream = new FileOutputStream("Exercise17_05.dat");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(arr);
            objectOutputStream.writeObject(date);
            objectOutputStream.writeDouble(value);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

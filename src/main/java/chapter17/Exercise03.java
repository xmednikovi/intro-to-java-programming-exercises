package chapter17;

import java.io.*;
import java.util.Random;

public class Exercise03 {

    public static void main(String[] args) {
        Random random = new Random();

        // create a file
        System.out.println("....Creating a file....");
        try (FileOutputStream fileOutputStream = new FileOutputStream("Exercise17_03.dat", false);
             DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream)) {

            for (int i = 0; i < 10; i ++) {
                double number = random.nextDouble(1.0, 10.0);
                dataOutputStream.writeDouble(number);
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        // read a file
        System.out.println("....Reading a file....");
        try (FileInputStream fileInputStream = new FileInputStream("Exercise17_03.dat");
             DataInputStream dataInputStream = new DataInputStream(fileInputStream)) {

            double sum = 0;

            try {
                double next = dataInputStream.readDouble();
                while (next != -1) {
                    sum += next;
                    next = dataInputStream.readDouble();
                }
            } catch (EOFException ex) {
                System.out.println("The sum is: " + sum);
            }


        } catch (Exception e) {
            System.out.println("Exception");
            System.out.println(e.getMessage());
        }
    }
}

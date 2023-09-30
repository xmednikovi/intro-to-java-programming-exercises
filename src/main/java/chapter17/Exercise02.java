package chapter17;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class Exercise02 {

    public static void main(String[] args) {
        Random random = new Random();
        try (FileOutputStream fileOutputStream = new FileOutputStream("Exercise17_02.dat", true);
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream)) {
            for (int i = 0; i < 150; i++) {
                int number = random.nextInt();
                dataOutputStream.writeInt(number);
            }
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}

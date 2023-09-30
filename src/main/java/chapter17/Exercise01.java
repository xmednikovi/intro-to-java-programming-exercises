package chapter17;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;

public class Exercise01 {

    public static void main(String[] args) throws Exception{
        FileOutputStream fileOutputStream = new FileOutputStream("Exercise17_01.txt", true);
        PrintWriter writer = new PrintWriter(fileOutputStream);
        Random random = new Random();
        for (int i = 0; i < 150; i ++){
            int number = random.nextInt();
            writer.println(number);
        }
        writer.close();
        fileOutputStream.close();
    }
}

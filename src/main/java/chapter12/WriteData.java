package chapter12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteData {

    public static void main(String[] args) throws IOException {
        File file = new File("scores.txt");
        if (file.exists()) {
            System.out.println("File already exists!");
            System.exit(1);
        }

        PrintWriter writer = new PrintWriter(file);
        writer.print("Yuri Mednikov");
        writer.println(100);
        writer.print("John Doe");
        writer.println(50);

        writer.close();

    }
}

package chapter12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteDataWithAutoClose {

    public static void main(String[] args) {
        File file = new File("scores2.txt");
        if (file.exists()) {
            System.out.println("File does already exists");
            System.exit(1);
        }

        try (PrintWriter writer = new PrintWriter(file)) {
            writer.print("John Doe");
            writer.println(100);
            writer.print("Another user");
            writer.println(45);
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}

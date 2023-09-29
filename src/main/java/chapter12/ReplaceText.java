package chapter12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceText {

    public static void main(String[] args) {

        final String WORD = "lorem";
        final String REPLACE = "LLOOOOREEEMM";

        File sourceFile = new File("file1.txt");
        if (sourceFile.exists() == false) {
            System.out.println("Source file does not exist");
            System.exit(1);
        }

        File targetFile = new File("file2.txt");
        if (targetFile.exists() == true) {
            System.out.println("Source file already exist");
            System.exit(1);
        }

        try (
                Scanner scanner = new Scanner(sourceFile);
                PrintWriter writer = new PrintWriter(targetFile)
        ) {

            while (scanner.hasNext()) {
                String s1 = scanner.nextLine();
                String s2 = s1.replaceAll(WORD, REPLACE);
                writer.println(s2);
            }

        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}

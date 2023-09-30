package chapter17;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Exercise04 {

    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.out.println("Invalid arguments");
            System.exit(1);
        }

        String inputFilename = args[0];
        String outputFilename = args[1];

        File inputFile = new File(inputFilename);

        if ( !inputFile.exists()) {
            System.out.println("The text file does not exist!");
            System.exit(1);
        }

        try (
                Scanner scanner = new Scanner(inputFile);
                FileOutputStream fileOutputStream = new FileOutputStream(outputFilename);
                DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream)) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                dataOutputStream.writeUTF(line);
            }

        } catch ( Exception ex ){
            System.out.println(ex.getMessage());
        }

        long inputSize = inputFile.length();
        File outputFile = new File(outputFilename);
        long outputSize = outputFile.length();

        System.out.printf("Input file size: %d bytes\nOutput file size: %d bytes", inputSize, outputSize);
    }
}

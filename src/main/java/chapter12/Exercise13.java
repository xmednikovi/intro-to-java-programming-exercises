package chapter12;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exercise13 {

    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println("Invalid arguments!");
            System.exit(1);
        }

        String filename = args[0];
        File file = new File(filename);

        if (!file.exists()) {
            System.out.println("The file does not exist");
            System.exit(1);
        }

        Scanner scanner = new Scanner(file);
        int lineCount = 0;
        int charactersCount = 0;

        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            lineCount += 1;
            charactersCount += line.length();
        }

        System.out.printf("The file %s has %d lines and %d characters\n", filename, lineCount, charactersCount);
    }
}

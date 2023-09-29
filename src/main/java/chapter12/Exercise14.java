package chapter12;

import java.io.File;
import java.util.Scanner;

public class Exercise14 {

    public static int readInFile (String line, File file) throws Exception {
        Scanner scanner = new Scanner(file);
        int lineCount = 1;
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            if (input.equals(line)) {
                return lineCount;
            } else {
                lineCount += 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            System.out.println("Invalid arguments!");
            System.exit(1);
        }

        String fileName = args[0];
        String line = args[1];
        File file = new File(fileName);

        if (! file.exists()) {
            System.out.println("The file does not exist!");
            System.exit(1);
        }

        int result = readInFile(line, file);
        if (result != -1) {
            System.out.println("The line number is " + result);
        } else {
            System.out.println("The line is not found");
        }
    }
}

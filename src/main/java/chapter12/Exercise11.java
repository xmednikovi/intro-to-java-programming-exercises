package chapter12;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11 {

    public static void main(String[] args) throws Exception {
        if (args.length != 2){
            System.out.println("Invalid arguments");
            System.exit(1);
        }

        String str = args[1];
        String filename = args[0];

        File file = new File(filename);
        if (! file.exists()) {
            System.out.println("File does not exist");
            System.exit(1);
        }

        Scanner scanner = new Scanner(file);
        ArrayList<String> tempLines = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            tempLines.add(line);
        }

        scanner.close();

        PrintWriter writer = new PrintWriter(file);
        for (String temp: tempLines) {
            String result = temp.replace(str, "");
            writer.println(result);
        }

        writer.close();
    }
}

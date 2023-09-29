package chapter12;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise16 {

    public static void main(String[] args) throws Exception {
        if (args.length != 3){
            System.out.println("Invalid arguments");
            System.exit(1);
        }

        String filename = args[0];
        String oldString = args[1];
        String newString = args[2];

        File file = new File(filename);
        if ( ! file.exists()) {
            System.out.println("File does not exist");
            System.exit(1);
        }

        Scanner scanner = new Scanner(file);
        ArrayList<String> tmp = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            tmp.add(line);
        }

        scanner.close();

        PrintWriter writer = new PrintWriter(file);
        for (String s : tmp){
            String result = s.replace(oldString, newString);
            writer.println(result);
        }

        writer.close();
    }
}

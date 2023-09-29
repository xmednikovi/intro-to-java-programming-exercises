package chapter12;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Exercise15 {

    public static int writeInFile (String name, File file) throws Exception {
        Scanner scanner = new Scanner(file);

        ArrayList<String> names = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            names.add(line);
        }

        if (names.contains(name)) {
            return -1;
        }
        names.add(name);
        names.sort(Comparator.naturalOrder());

        int position = names.indexOf(name) + 1;

        PrintWriter writer = new PrintWriter(file);
        for (String s: names) {
            writer.println(s);
        }

        writer.close();
        scanner.close();
        return position;
    }

    public static void main(String[] args) throws Exception {

        if (args.length != 2){
            System.out.println("Invalid arguments");
            System.exit(1);
        }

        String filename = args[0];
        String name = args[1];

        File file = new File(filename);
        if ( ! file.exists()) {
            System.out.println("File does not exist!");
            System.exit(1);
        }

        int result = writeInFile(name, file);
        if (result == -1 ){
            System.out.println("Name cannot be written because already exists in the list");
        } else {
            System.out.println("The name was written with position " + result);
        }
    }
}

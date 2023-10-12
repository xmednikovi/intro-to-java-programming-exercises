package chapter20;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Exercise01 {

    public static void main(String[] args) {
        // get file name from command line
        if (args.length !=1) {
            System.out.println("Invalid arguments");
            System.exit(1);
        }
        String fileName = args[0];

        // create file
        File file = new File(fileName);
        if ( !file.exists() ){
            System.out.println("File does not exist");
            System.exit(1);
        }

        ArrayList<String> arrayList = new ArrayList<>();

        // read file
        try (Scanner scanner = new Scanner(file)) {
            // store items in an array list
            while (scanner.hasNextLine()) {
                arrayList.add(scanner.nextLine());
            }

            // sort in descending order
            arrayList.sort(Comparator.reverseOrder());

            // print items
            arrayList.forEach(System.out::println);
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}

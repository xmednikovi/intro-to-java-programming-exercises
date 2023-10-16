package chapter21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Exercise02 {

    public static void readStudentsFromFile (File file, Set<String> studentsSet)
            throws FileNotFoundException {
        FileReader fileReader = new FileReader(file);
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()) {
            String result = scanner.nextLine();
            studentsSet.add(result);
        }
    }
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.out.println("Invalid arguments! Provide at least one file");
            System.exit(1);
        }

        List<File> files = new ArrayList<>();
        for (String a : args) {
            File file = new File(a);
            if (file.exists()) {
                files.add(file);
            }
        }

        // for each file, get names of students and add them to set
        Set<String> students = new HashSet<>();
        for (File f : files){
            readStudentsFromFile(f, students);
        }

        // sort in descending order
        // print students in descending order
        students.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

    }
}

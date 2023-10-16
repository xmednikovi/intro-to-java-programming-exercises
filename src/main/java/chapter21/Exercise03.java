package chapter21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Exercise03 {

    public static void readStudentsFromFile (File file, Map<String, Integer> students)
            throws FileNotFoundException {
        FileReader fileReader = new FileReader(file);
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()) {
            String result = scanner.nextLine();
            if (students.containsKey(result)) {
                // increase attendance
                int currentAttendence = students.get(result);
                currentAttendence += 1;
                students.put(result, currentAttendence);
            } else {
                // add with attendence 1
                students.put(result, 1);
            }
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

        Map<String, Integer> attendence = new TreeMap<>(Comparator.reverseOrder());
        for (File f : files ){
            readStudentsFromFile(f, attendence);
        }

        // print in descending order
        // only students that attended more than 1 class

        attendence.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey()));
    }
}

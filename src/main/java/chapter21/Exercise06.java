package chapter21;

import java.io.File;
import java.io.FileReader;
import java.util.*;

public class Exercise06 {

    public static void main(String[] args) throws Exception{
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

        Map<String, Integer> students = new TreeMap<>(Comparator.reverseOrder());

        // read data from file
        for (File file: files) {
            FileReader fileReader = new FileReader(file);
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                String studentName = scanner.nextLine();
                if (students.containsKey(studentName)) {
                    int numberOfCourses = students.get(studentName);
                    numberOfCourses += 1;
                    students.put(studentName, numberOfCourses);
                } else {
                    students.put(studentName, 1);
                }
            }
        }

        // display results
        for (Map.Entry<String, Integer> student : students.entrySet()) {
            String firstName = student.getKey().split(" ")[0];
            System.out.println(firstName + ": " + student.getValue());
        }
    }
}

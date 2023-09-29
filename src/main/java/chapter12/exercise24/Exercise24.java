package chapter12.exercise24;

import java.io.File;
import java.io.PrintWriter;

public class Exercise24 {

    public static void main(String[] args) throws Exception {
        File file = new File("salary.txt");
        if (file.exists()) {
            System.out.println("File already exists!");
            System.exit(1);
        }

        PrintWriter writer = new PrintWriter(file);
        for (int i = 0; i <1000; i++){
            FacultyMember facultyMember = new FacultyMember();
            String str = String.format("%s %s %s %d",
                    facultyMember.getFirstName(),
                    facultyMember.getLastName(),
                    facultyMember.getRank(),
                    facultyMember.getSalary()
            );
            writer.println(str);
        }

        writer.close();
    }
}

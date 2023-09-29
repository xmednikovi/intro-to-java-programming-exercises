package chapter12;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadData {

    public static void main(String[] args) throws IOException {
        File file = new File("scores3.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()){
            String firstName = scanner.next();
            String lastName = scanner.next();
            int score = scanner.nextInt();
            System.out.printf("%s %s %d\n", firstName, lastName, score);
        }
        scanner.close();
    }
}

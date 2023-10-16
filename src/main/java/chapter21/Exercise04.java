package chapter21;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;

public class Exercise04 {

    private final static Set<Character> VOWELS_SET = Set.of('A', 'E', 'I', 'O', 'U');

    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("Invalid arguments!");
            System.exit(1);
        }

        File file = new File(args[0]);
        if ( ! file.exists()) {
            System.out.println("The file does not exist");
            System.exit(1);
        }

        // read file line by line
        FileReader fileReader = new FileReader(file);
        Scanner scanner = new Scanner(fileReader);

        int consonantsCount = 0;
        int vowelsCount = 0;

        while (scanner.hasNextLine()){
            String line = scanner.nextLine().toUpperCase();
            for (Character ch : line.toCharArray()) {
                if (VOWELS_SET.contains(ch)) {
                    vowelsCount += 1;
                } else {
                    consonantsCount += 1;
                }
            }
        }

        // display results
        System.out.printf("Number of vowels in file: %d\nNumber of consonants in file: %d",
                vowelsCount, consonantsCount);
    }
}

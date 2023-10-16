package chapter21;

import java.io.File;
import java.io.FileReader;
import java.util.*;

public class Exercise08 {

    public static void main(String[] args) throws Exception{
        if (args.length != 1){
            System.out.println("Invalid arguments");
            System.exit(1);
        }

        File file = new File(args[0]);
        if ( ! file.exists() ){
            System.out.println("The file does not exist");
            System.exit(1);
        }

        FileReader fileReader = new FileReader(file);
        Scanner scanner = new Scanner(fileReader);

        Map<String, Integer> map = new TreeMap<>();
        LinkedList<String> words = new LinkedList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().toLowerCase();
            String[] lineWords = line.split("[ @!~{}\\[\\]$#^&*\n\t\r.,;?'\")(]");
            words.addAll(Arrays.stream(lineWords).toList());
        }

        for (String word : words) {
            if ( map.containsKey(word) ) {
                int count = map.get(word);
                count += 1;
                map.put(word, count);
            } else {
                map.put(word, 1);
            }
        }

        map.forEach((word, count) -> System.out.printf("%d : %s\n", count, word));
    }
}

package chapter21;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Exercise07 {

    public static void main(String[] args) {
        final String text = "Good morning. Have a good class. Have a good visit. Have fun!";

        Map<String, Integer> map = new TreeMap<>(Comparator.reverseOrder());
        String[] words = text.split("[\\s+\\p{P}]");
        for (String word: words) {
            String key = word.toLowerCase();
            if (key.length() > 0) {

                if ( map.containsKey(key)) {
                    int count = map.get(key);
                    count ++;
                    map.put(key, count);
                } else {
                    map.put(key, 1);
                }

            }
        }

        map.forEach((key, value) -> System.out.println(key + "\t" + value));
    }
}

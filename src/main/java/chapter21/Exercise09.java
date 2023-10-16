package chapter21;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise09 {

    public static void main(String[] args) {
        Map<Integer, String> regions = new HashMap<>();

        // initialize map with some values
        regions.put(63, "Самара");
        regions.put(62, "Рязань");
        regions.put(64, "Саратов");
        regions.put(69, "Тверь");
        regions.put(76, "Ярославль");
        regions.put(35, "Вологда");
        regions.put(78, "Санкт-Петербург");


        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the code of the region: ");
        int regionCode = scanner.nextInt();
        if (regionCode < 1 | regionCode > 100) {
            System.out.println("Invalid input. The region code is an integer from 1 to 100");
        }

        if (regions.containsKey(regionCode)) {
            String capital = regions.get(regionCode);
            System.out.printf("The capital of %d region is %s", regionCode, capital);
        } else{
            System.out.println("Invalid input");
        }
    }
}

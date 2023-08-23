package chapter04;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Exercise24 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first country:");
        String country1 = input.nextLine();
        System.out.print("Enter the second country:");
        String country2 = input.nextLine();
        System.out.print("Enter the third country:");
        String country3 = input.nextLine();
        List<String> countries = List.of(country1, country2, country3);
        List<String> sorted = countries.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.printf("The three countries in descending order: %s, %s, %s", sorted.get(0), sorted.get(1), sorted.get(2));
    }
}

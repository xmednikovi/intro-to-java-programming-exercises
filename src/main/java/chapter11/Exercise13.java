package chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise13 {

    public static void removeDuplicate(ArrayList<Integer> list){
        ArrayList<Integer> tmp = new ArrayList<>();
        for (Integer n: list){
            if (!tmp.contains(n)) {
                tmp.add(n);
            }
        }
        list.clear();
        list.addAll(tmp);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.print("Add 10 integers: ");
        for (int i = 0; i<10;i++){
            numbers.add(scanner.nextInt());
        }

        removeDuplicate(numbers);

        System.out.println("Distinct integers are: ");
        numbers.forEach(n -> System.out.print(n + " "));
    }
}

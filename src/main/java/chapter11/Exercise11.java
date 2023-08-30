package chapter11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise11 {

    public static void sort(ArrayList<Integer> list){
        Collections.sort(list);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.print("Enter 5 numbers: ");
        for (int i = 0; i < 5; i ++) {
            numbers.add(scanner.nextInt());
        }

        sort(numbers);

        for (Integer i:numbers){
            System.out.print(i + " ");
        }
    }
}

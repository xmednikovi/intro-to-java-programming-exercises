package chapter19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise10 {

    public static <E extends Comparable<E>> E min(ArrayList<E> list) {
        return Collections.min(list);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Please enter 10 numbers: ");
        for (int i = 0; i < 10; i++){
            int input = scanner.nextInt();
            list.add(input);
        }

        Integer smallest = min(list);
        System.out.println("The smallest value is " + smallest.toString());
    }
}

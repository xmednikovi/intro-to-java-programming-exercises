package chapter19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise09 {

    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        Collections.sort(list);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Please enter 10 numbers: ");
        for (int i = 0; i < 10; i++){
            int input = scanner.nextInt();
            list.add(input);
        }

        sort(list);

        for (Integer x: list){
            System.out.print(x + " ");
        }
    }
}

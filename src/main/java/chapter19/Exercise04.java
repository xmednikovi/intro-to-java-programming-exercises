package chapter19;

import chapter19.exercise03.Pair;

import java.util.Scanner;

public class Exercise04 {
    public static <T extends Comparable<T>> T findSmallest (Pair<T> pair){
        if (pair.getT1().compareTo(pair.getT2()) < 0) {
            return pair.getT1();
        } else {
            return pair.getT2();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter integer 1: ");
        int i1 = scanner.nextInt();
        System.out.print("Please enter integer 2: ");
        int i2 = scanner.nextInt();
        Pair<Integer> pair = new Pair<>(i1, i2);
        Integer smallestValue = findSmallest(pair);
        System.out.println("The smallest value is " + smallestValue.toString());
    }
}

package chapter07;

import java.util.Scanner;

public class Exercise27 {

    public static boolean isSortedConstantInterval(int[] list){
        int size = list.length;
        int interval = list[1] - list[0];
        if (interval < 0) {
            return false;
        }

        for (int i = 1; i < size - 1; i++){
            // check if not sorted at all
            int x = list[i];
            int y = list[i + 1];
            if (x > y) {
                return false;
            }
            // find interval
            int diff = y - x;
            if (diff != interval) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size of an array:");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++ ){
            int next = scanner.nextInt();
            numbers[i] = next;
        }

        boolean sorted = isSortedConstantInterval(numbers);
        if (sorted){
            System.out.println("The array is sorted with constant interval");
        } else {
            System.out.println("The array is not sorted with constant interval");
        }
    }
}

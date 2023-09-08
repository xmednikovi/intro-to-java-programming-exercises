package chapter13;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise02 {

    public static int average(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer i: list){
            sum += i;
        }
        return sum / list.size();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.print("Please enter 10 numbers: ");

        for (int i = 0; i < 10; i++) {
            numbers.add(scanner.nextInt());
        }

        int result = average(numbers);

        System.out.printf("The average of the list is %d", result);
    }
}

package chapter06;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Exercise05 {

    public static void displaySortedNumbers(int num1, int num2, int num3){
        List<Integer> list = List.of(num1, num2, num3);
        list.stream().sorted(Comparator.reverseOrder()).forEach(n -> System.out.print(n + " "));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter number 2: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter number 3: ");
        int number3 = scanner.nextInt();
        displaySortedNumbers(number1, number2, number3);
    }
}

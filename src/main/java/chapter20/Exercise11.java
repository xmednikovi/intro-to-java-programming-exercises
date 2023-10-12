package chapter20;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Stack;

public class Exercise11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> numbers = new Stack<>();

        // read integers
        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++){
            int x = scanner.nextInt();
            if (numbers.empty()) {
                numbers.push(x);
            } else {
                int lastElement = numbers.peek();
                if (lastElement != x){
                    numbers.push(x);
                }
            }

        }

        // display integers
        numbers.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(e -> System.out.print(e + " "));

    }
}

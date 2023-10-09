package chapter19.exercise02;

import java.util.Scanner;

public class Exercise02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GenericStack<String> stack = new GenericStack<>();

        System.out.print("Please enter 5 strings: ");

        for (int i = 0; i < 5; i ++) {
            String input = scanner.nextLine();
            stack.push(input);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(stack.pop());
        }
    }
}

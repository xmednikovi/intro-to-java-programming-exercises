package chapter07;

import java.util.Scanner;

public class Exercise05 {

    public static boolean isEven (int number){
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int input;
        int[] numbers = new int[10];
        do {
            System.out.print("Enter a number or 0 to finish: ");
            input = scanner.nextInt();
            if (input > 0) {
                numbers[count] = input;
                count++;
            }
        } while (count < 10 && input > 0);

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i< numbers.length; i++){
            int number = numbers[i];
            if (number > 0){
                if (isEven(number)) {
                    evenCount ++;
                } else {
                    oddCount ++;
                }
            } else {
                continue;
            }
        }

        System.out.printf("The number of numbers in array is %d\nEven numbers: %d\nOdd numbers: %d",
                count, evenCount, oddCount);
    }
}

package chapter07;

import java.util.Scanner;

public class Exercise03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[50];
        System.out.print("Enter numbers from 1 to 50 or 0 to exit");

        int input;

        // read numbers
        do {
            input = scanner.nextInt();
            if (input < 0 || input > 50) {
                System.out.println("It should be more than 0 and less than 50!");
                System.exit(0);
            } else {
                if (input != 0){
                    int index = input - 1;
                    numbers[index] ++;
                }
            }

        } while (input > 0);

        // display occurence

        for (int i = 0; i < 50; i ++) {
            if (numbers[i] != 0) {
//                System.out.printf("%d occures %d times\n", i+1,numbers[i]);
                int occurence = numbers[i];
                int number = i + 1;
                if (occurence > 1) {
                    System.out.printf("%d occures %d times\n", number, occurence);
                } else {
                    System.out.printf("%d occures %d time\n", number, occurence);
                }
            }
        }
    }
}

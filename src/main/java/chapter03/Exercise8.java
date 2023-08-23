package chapter03;

import java.util.Scanner;

public class Exercise8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter three numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a > b) {
            if (a > c) {
                // a largest, c second, b smallest
                System.out.println(a + "," + c + ", " + b);
            } else {
                // c largest, a second, b smallest
                System.out.println(c + "," + a + ", " + b);
            }
        } else {
            if (b > c){
                // b largest, c second, a smallest
                System.out.println(b + "," + c + ", " + a);
            } else {
                // c largest, b second, a smallest
                System.out.println(c + "," + b + ", " + a);
            }
        }
    }
}

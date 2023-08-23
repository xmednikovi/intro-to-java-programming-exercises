package chapter03;

import java.util.Scanner;

public class Exercise9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter isbn: ");
        String isbn = input.next();
        int checksum = 0;

        for (int i = 0; i < isbn.length(); i++) {
            int d = isbn.charAt(i) - '0';
            checksum += d * (i+1);
        }

        checksum = checksum % 11;

        if (checksum == 10 ){
            System.out.println(isbn + "X");
        } else {
            System.out.println(isbn + "" + checksum);
        }
    }
}

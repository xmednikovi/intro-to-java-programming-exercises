package chapter04;

import java.util.Scanner;

public class Exercise21 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a SSN:");
        String data = input.nextLine();
        String[] blocks = data.split("-");
        if (blocks[0].length() == 3 && blocks[1].length() == 2 && blocks[2].length() == 4){
            System.out.printf("%s is a valid SSN", data);
        } else {
            System.out.printf("%s is an invalid SSN", data);
        }
    }
}

package chapter06;

import java.util.Scanner;

public class Exercise23 {

    public static int count (String str, char a){
        int count = 0;
        for (int i=0; i < str.length(); i ++) {
            if (str.charAt(i) == a) {
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter a character to count: ");
        char ch = scanner.nextLine().charAt(0);
        int result = count(str, ch);
        System.out.printf("The character %c occurs %d times", ch, result);
    }
}

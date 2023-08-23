package chapter05;

import java.util.Scanner;

public class Exercise51 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String string1 = scanner.nextLine();
        System.out.print("Enter string 2: ");
        String string2 = scanner.nextLine();
        String commonPrefix = "";
        int minimalLength = Math.min(string1.length(), string2.length());
        for (int i=0; i<minimalLength; i++) {
            char c1 = string1.charAt(i);
            char c2 = string2.charAt(i);
            if (c1 == c2) {
                commonPrefix += c1;
            } else {
                break;
            }
        }
        if (commonPrefix.isEmpty()) {
            System.out.printf("%s and %s have no common prefix", string1, string2);
        } else {
            System.out.println(commonPrefix + " is a common prefix");
        }
    }
}

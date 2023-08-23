package chapter06;

import java.util.Scanner;

public class Exercise18 {

    public static boolean isPasswordValid(String password){
        if (password.length() < 10) {
            return false;
        }

        int numberOfDigits = 0;

        for (int i = 0; i < password.length(); i ++) {
            char c = password.charAt(i);
            if (Character.isDigit(c)) {
                numberOfDigits ++;
            }
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
        }

        if (numberOfDigits < 3) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a password: ");
        String password = scanner.nextLine();
        boolean isValid = isPasswordValid(password);
        if (isValid) {
            System.out.println("The password is valid");
        } else {
            System.out.println("The password is invalid");
        }
    }
}

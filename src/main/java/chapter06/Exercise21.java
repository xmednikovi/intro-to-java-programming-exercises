package chapter06;

import java.util.Scanner;

public class Exercise21 {

    public static int letterToDigit (String letter){
        int number = 0;
        if ("def".contains(letter)) {
            return 3;
        } else if ("ghi".contains(letter)) {
            return 4;
        } else if ("jkl".contains(letter)) {
           return 5;
        } else if ("mno".contains(letter)){
            return 6;
        } else if ("pqrs".contains(letter)) {
            return 7;
        } else if ("tuv".contains(letter)) {
            return 8;
        } else if ("abc".contains(letter)){
            return 2;
        } else {
            return 9;
        }
    }

    public static String wordToDigits (String input) {
        String data = input.toLowerCase();
        String result = "";
        for (int i=0; i < data.length() ; i ++){
            String letter = data.substring(i, i+1);
            int number = letterToDigit(letter);
            result += number;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().trim().replace("-", "");
        System.out.println(input);
        String partToReplace = input.substring(4);
        System.out.println(partToReplace);
        String result = wordToDigits(partToReplace);
        System.out.println("1-800-"+result);
    }
}

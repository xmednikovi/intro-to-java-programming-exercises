package chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise18 {

    public static ArrayList<Character> toCharacterArray(String s){
        ArrayList<Character> tmp = new ArrayList<>();
        char[] arr =  s.toCharArray();
        for (int i = 0; i<arr.length; i++){
            tmp.add(arr[i]);
        }
        return tmp;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        ArrayList<Character> arr = toCharacterArray(input);
        arr.forEach(c -> System.out.print(c + " "));
    }
}

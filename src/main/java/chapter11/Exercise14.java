package chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise14 {

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> tmp = new ArrayList<>();
        tmp.addAll(list1);
        tmp.addAll(list2);
        return tmp;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 integers for list 1: ");
        for (int i = 0; i<5;i++){
            list1.add(scanner.nextInt());
        }

        System.out.println("Enter 5 integers for list 2: ");
        for (int i = 0; i<5;i++){
            list2.add(scanner.nextInt());
        }

        ArrayList<Integer> result = union(list1, list2);

        System.out.println("The combined list is: ");
        result.forEach(n -> System.out.print(n + " "));
    }
}

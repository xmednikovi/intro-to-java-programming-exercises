package chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12 {

    public static double sum(ArrayList<Double> list) {
        double sum = 0d;
        for (Double number: list){
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> arrayList = new ArrayList<>();
        System.out.print("Enter 5 numbers: ");
        for (int i = 0; i < 5; i ++){
            double input = scanner.nextDouble();
            arrayList.add(input);
        }
        double result = sum(arrayList);
        System.out.println("The sum of numbers in array list is " + result);
    }
}

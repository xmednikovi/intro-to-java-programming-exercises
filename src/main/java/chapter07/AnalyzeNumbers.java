package chapter07;

public class AnalyzeNumbers {
    public static double getAverage (double[] numbers){
        double sum = 0.0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum / numbers.length;
    }

    public static int countNumbersAboveValue (double[] numbers, double value){
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > value){
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        double[] numbers = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8, 9, 10};
        double average = getAverage(numbers);
        System.out.println("The average is " + average);
        int count = countNumbersAboveValue(numbers, average);
        System.out.println("Count of numbers above average is " + count);
    }
}

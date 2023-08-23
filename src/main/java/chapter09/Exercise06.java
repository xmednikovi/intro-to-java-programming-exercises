package chapter09;


import java.util.Random;

public class Exercise06 {

    public static void sort(int[] numbers) {

        for (int i = 0; i< numbers.length; i++){
            int currentMin = numbers[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (currentMin > numbers[j]) {
                    currentMin = numbers[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                numbers[currentMinIndex] = numbers[i];
                numbers[i] = currentMin;
            }
        }

    }

    public static void main(String[] args) {
        // intialize array
        int[] numbers = new int[10000];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(10000);
        }

        // create stop watch
        Stopwatch stopwatch = new Stopwatch();

        // set start time
        stopwatch.start();

        // do sorting
        sort(numbers);

        // set end time
        stopwatch.stop();

        // show difference
        System.out.println("The sorting took " + stopwatch.getElapsedTime() + " milliseconds");
    }
}

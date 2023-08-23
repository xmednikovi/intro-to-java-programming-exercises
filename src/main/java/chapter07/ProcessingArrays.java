package chapter07;

import java.util.Scanner;

public class ProcessingArrays {

    public static void shiftElements (int[] numbers){
        int first = numbers[0];
        for (int i=1; i<numbers.length; i++) {
            // get current number
            int currentNumber = numbers[i];

            int newPosition = i - 1;
            int swap = numbers[newPosition];
            numbers[newPosition] = currentNumber;
            numbers[i] = swap;
        }
        numbers[numbers.length - 1] = first;
    }

    public static void shuffleArray (int[] numbers){
        for (int i = 0; i<numbers.length; i ++) {
            // get current number
            int currentNumber = numbers[i];

            // generate new position
            int newPosition = getRandomNumber(0, numbers.length);

            // get value from this position
            if (newPosition != i) {
                int swap = numbers[newPosition];
                // swap values
                numbers[newPosition] = currentNumber;
                numbers[i] = swap;
            }
        }
    }

    public static int findLargest (int[] numbers) {
        int largest = numbers[0];
        for (int i = 1; i<numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static int findIndex(int[] numbers, int number){
        for (int i = 0; i < numbers.length; i++) {
            if (number == numbers[i]){
                return i;
            }
        }
        return -1;
    }

    public static int sumAllElements(int[] numbers){
        int result = 0;
        for (int i = 0; i<numbers.length; i++){
            result += numbers[i];
        }
        return result;
    }

    public static int getRandomNumber(int min, int max){

        return (int) Math.round(Math.random() * (max - min) + min);

    }

    public static void initializeArrayWithRandom(int[] numbers){

        for (int i = 0; i< numbers.length; i++){
            numbers[i] = getRandomNumber(1, 100);
        }

    }

    public static void arrayToString(int[] numbers){
        String result = "";
        for (int i = 0; i < numbers.length; i++){
            if (i == numbers.length - 1) {
                result += numbers[i];
            } else {
                result += numbers[i] + " ";
            }
        }
        System.out.println(result);
    }

    public static void readArray (int[] numbers) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter " + numbers.length + " numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Please enter a number %d:", i + 1);
            int number = scanner.nextInt();
            numbers[i] = number;
        }
    }

    public static void main(String[] args) {
//        int[] numbers1 = new int[10];
//        System.out.println("Read array from console");
//        readArray(numbers1);
//        arrayToString(numbers1);

        System.out.println("Initialize array with randoms");
        int[] numbers = new int[10];
        initializeArrayWithRandom(numbers);
        arrayToString(numbers);

        int sum = sumAllElements(numbers);
        System.out.println("Sum all elements is: " + sum);

        int largest = findLargest(numbers);
        System.out.println("Largest element is: " + largest);

        int index = findIndex(numbers, largest);
        System.out.printf("The index of %d is %d\n", largest, index);

        System.out.println("Shuffle elements");
        shuffleArray(numbers);
        arrayToString(numbers);

        System.out.println("Shifting elements");
        shiftElements(numbers);
        arrayToString(numbers);
    }
}

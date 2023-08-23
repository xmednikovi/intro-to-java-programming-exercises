package chapter05;

public class PrimeNumbers {

    public static boolean isPrimeNumber(int number){
        for (int divisor = 2; divisor <= number / 2; divisor ++) {
            if (number % divisor == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        final int NUMBER_COUNT = 50;

        int number = 2;
        int count = 0;
        while (count < NUMBER_COUNT) {
            boolean isPrime = isPrimeNumber(number);
            if (isPrime) {
                count++;
                System.out.println(number);
            }
            number ++;
        }
    }
}

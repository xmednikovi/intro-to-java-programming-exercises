package chapter05;

public class Exercise20 {

    public static boolean isPrimeNumber(int number){
        for (int divisor = 2; divisor <= number / 2; divisor ++) {
            if (number % divisor == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int number = 2;
        int perLineCount = 0;

        while (number <= 1200) {

            if (perLineCount == 8) {
                perLineCount = 0;
                System.out.println();
            }
            boolean isPrime = isPrimeNumber(number);
            if (isPrime) {
                System.out.print(number + " ");
                perLineCount ++;
            }

            number ++;
        }
    }
}

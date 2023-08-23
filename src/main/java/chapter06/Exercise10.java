package chapter06;

public class Exercise10 {

    public static boolean isPrime(int number){
        for (int divisor = 2; divisor <= number / 2; divisor ++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int totalPrimeNumbers = 0;
        for (int i=0; i<10000; i++){
            boolean isPrimeNumber = isPrime(i);
            if (isPrimeNumber) totalPrimeNumbers++;
        }
        System.out.println("Total number of prime numbers is: " + totalPrimeNumbers);
    }
}

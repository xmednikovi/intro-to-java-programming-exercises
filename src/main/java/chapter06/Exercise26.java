package chapter06;

public class Exercise26 {

    public static boolean isPalindrome (int number){
        StringBuilder sb = new StringBuilder(Integer.toString(number));
        String str = Integer.toString(number);
        return str.equalsIgnoreCase(sb.reverse().toString());
    }
    public static boolean isPrime (int number){
        for (int i = 2; i <= number / 2; i ++){
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        final int NUMBER_COUNT = 120;

        int number = 2;
        int count = 0;
        while (count < NUMBER_COUNT) {
            boolean isPrime = isPrime(number);
            boolean isPalindrome = isPalindrome(number);
            if (isPrime && isPalindrome) {
                count++;
                System.out.println(number);
            }
            number ++;
        }
    }
}

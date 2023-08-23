package chapter07;

public class Exercise06 {

    public static void main(String[] args) {
        final int LIMIT = 50;
        // initialize array
        boolean[] numbers = new boolean[LIMIT + 1];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = true;
        }

        // check
        for (int x = 2; x*x <= LIMIT; x ++) {
            if (numbers[x] == true) {
                for (int i = x*x; i <= LIMIT; i+=x) {
                    numbers[i] = false;
                }
            }
        }

        // print numbers
        for (int i = 2; i < numbers.length; i++) {
            if (numbers[i] == true) {
                System.out.print(i + " ");
            }
        }
    }
}

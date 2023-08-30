package chapter10;

public class Exercise06 {

    public static void main(String[] args) {
        // create stack of integers
        StackOfIntegers stack = new StackOfIntegers();

        // find prime numbers less than 120
        for (int n = 2; n < 120 ; n++){
            // check that number is prime
            MyInteger myInteger = new MyInteger(n);
            if (myInteger.isPrime()) {
                stack.push(n);
            }
        }

        // display the result
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}

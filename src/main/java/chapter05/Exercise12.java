package chapter05;

public class Exercise12 {

    public static void main(String[] args) {
        int n = 1;
        while (Math.pow(n, 3) <= 12000) {
            n ++;
        }
        System.out.println("The smallest n is: " + n);
    }
}

package chapter05;

public class Exercise13 {

    public static void main(String[] args) {
        int n = 115;
        while (Math.pow(n, 2) > 12000) {
            n--;
        }
        System.out.println("The largest n is " + n);
    }
}

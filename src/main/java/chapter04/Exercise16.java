package chapter04;

public class Exercise16 {

    public static void main(String[] args) {
        int number = 97 + (int) (Math.random() * 25);
        char character = (char) number;
        System.out.printf("%c", character);
    }
}

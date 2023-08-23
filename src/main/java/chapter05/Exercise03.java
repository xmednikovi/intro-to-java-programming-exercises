package chapter05;

public class Exercise03 {

    public static void main(String[] args) {
        System.out.printf("%-7s %10s\n", "Celsius", "Fahrenheit");
        for (int celsius = 0; celsius <= 100; celsius ++) {
            double fahrenheit = celsius * ((double) 9/5) + 32;
            System.out.printf("%-7d %10.1f\n", celsius, fahrenheit);
        }
    }
}

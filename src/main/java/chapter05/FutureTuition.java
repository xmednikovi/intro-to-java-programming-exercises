package chapter05;

public class FutureTuition {

    public static void main(String[] args) {
        final double CURRENT_TUITION = 10_000;
        int year = 0;
        double result = CURRENT_TUITION;
        do {
            result = result * 1.07;
            year ++;
        } while (result < 20_000);
        System.out.println("Tuition will be doubled in " + year + " years");
    }
}

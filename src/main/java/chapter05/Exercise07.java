package chapter05;

public class Exercise07 {

    public static void main(String[] args) {
        final double TUITION_START = 10_000;
        double tuition = TUITION_START;
        double worth = 0;
        for (int year = 1; year <= 14; year ++) {
            tuition = tuition * 1.06;
            if (year > 10) {
                worth += tuition;
            } else {
                System.out.printf("The tuition in the year %d is $%-10.2f\n", year, tuition);
            }
        }
        System.out.printf("The 4 year worth tuition after 10 years is $%-10.2f\n", worth);
    }
}

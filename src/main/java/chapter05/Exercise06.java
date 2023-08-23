package chapter05;

public class Exercise06 {

    public static void main(String[] args) {
        final double SQM_IN_PING = 3.305;
        int ping = 10;
        int sqm = 30;

        while (ping <=80) {
            double sqmResult = ping * SQM_IN_PING;
            double pingResult = sqm / SQM_IN_PING;
            System.out.printf("%-4d %7.3f    %-4d %5.3f\n", ping, sqmResult, sqm, pingResult);
            ping += 5;
            sqm += 5;
        }
    }
}

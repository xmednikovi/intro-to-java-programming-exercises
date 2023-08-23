package chapter06;

public class Exercise01 {

    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }

    public static void main(String[] args) {
        int lineCount = 0;
        for (int i = 1; i < 100; i++) {
            int number = getPentagonalNumber(i);
            if (lineCount == 10) {
                lineCount = 0;
                System.out.println();
            } else {
                lineCount ++;
                System.out.printf("%7d", number);
            }
        }
    }
}

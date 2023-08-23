package chapter05;

public class Exercise04 {

    public static void main(String[] args) {
        final double CM_IN_INCH = 2.54;
        System.out.printf("%-6s  %11s\n", "Inches", "Centimetres");
        for (int inch = 1; inch <= 10; inch ++) {
            double cm = inch * CM_IN_INCH;
            System.out.printf("%-6d  %-11.2f\n", inch, cm);

        }
    }
}

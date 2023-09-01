package chapter13.exercise06;

public class Exercise06 {

    public static void main(String[] args) {
        ComparableCircle circle1 = new ComparableCircle(18.9);
        ComparableCircle circle2  = new ComparableCircle(12.12);
        int result = circle1.compareTo(circle2);

        if (result < 1) {
            System.out.println("The circle 2 is larger than circle 1");
        } else {
            System.out.println("The circle 1 is larger than circle 2");
        }
    }
}

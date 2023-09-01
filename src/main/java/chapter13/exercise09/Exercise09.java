package chapter13.exercise09;

public class Exercise09 {

    public static void main(String[] args) {
        Circle circle1 = new Circle(4.5);
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(5);

        System.out.println("Circle1 equals circle2: " + circle1.equals(circle2));
        System.out.println("Circle2 equals circle3: " + circle2.equals(circle3));
        System.out.println("Circle1 equals circle3: " + circle1.equals(circle3));
    }
}

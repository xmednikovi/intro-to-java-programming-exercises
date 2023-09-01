package chapter13.exercise05;

public class Exercise05 {

    public static void main(String[] args) {
        Circle circle1 = new Circle(12.4);
        Circle circle2 = new Circle(7.8);
        Circle result1 = (Circle) GeometricObject.max(circle1, circle2);
        System.out.println(result1 == circle1);

        Rectangle rectangle1 = new Rectangle(5.4, 8.9);
        Rectangle rectangle2 = new Rectangle(8.9, 12.0);
        Rectangle result2 = (Rectangle) GeometricObject.max(rectangle1, rectangle2);
        System.out.println(result2 == rectangle2);
    }
}

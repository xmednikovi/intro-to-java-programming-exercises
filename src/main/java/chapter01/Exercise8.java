package chapter01;

public class Exercise8 {

    public static void main(String[] args) {
        final double pi = 3.14159;
        double radius = 6.5;

        double perimeter = 2 * radius * pi;
        double area = radius * radius * pi;

        System.out.println("Perimeter = " + perimeter + ", area = " + area);
    }
}

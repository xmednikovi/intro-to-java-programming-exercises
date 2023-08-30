package chapter10;

public class Exercise12 {

    public static void main(String[] args) {

        Triangle2D tr1 = new Triangle2D(
                new MyPoint(2.5, 2),
                new MyPoint(4.2, 3),
                new MyPoint(5, 3.5));

        System.out.printf("Area = %.3f\nPerimeter = %.3f\n", tr1.getArea(), tr1.getPerimeter());


        boolean containsPoint = tr1.contains(new MyPoint(3, 3));
        boolean containsTriangle = tr1.contains(new Triangle2D(
                new MyPoint(2.9, 2),
                new MyPoint(4, 1),
                new MyPoint(1, 3.4)
        ));

        boolean overlapsTriangle = tr1.overlaps(new Triangle2D(
                new MyPoint(2, 5.5),
                new MyPoint(4, -3),
                new MyPoint(2, 6.5)
        ));

        System.out.println("Contains point: " + containsPoint);
        System.out.println("Contains triangle: " + containsTriangle);
        System.out.println("Overlaps triangle: " + overlapsTriangle);

    }
}

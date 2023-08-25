package chapter10;

public class Exercise11 {

    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);
        System.out.printf("The area of circle is %.2f\nThe perimeter of circle is %.2f\n",
                c1.getArea(), c1.getPerimeter());

        boolean containsPoint = c1.contains(3,3);
        System.out.println("The circle c1 contains a point: " + containsPoint);

        boolean contains = c1.contains(new Circle2D(4, 5, 10.5));
        System.out.println("The circle c1 contains another circle: " + contains);

        boolean overlaps = c1.overlaps(new Circle2D(3,5,2.3));
        System.out.println("The circle c1 overlaps another circle: " + overlaps);
    }
}

package chapter10;

public class Exercise13 {

    public static void main(String[] args) {
        MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);
        System.out.println("The area is " + r1.getArea() + " \nThe perimeter is " + r1.getPerimeter());

        boolean containsPoint = r1.contains(3, 3);
        boolean containsRectangle = r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2));
        boolean overlaps = r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4));

        System.out.println("Rectangle contains point: " + containsPoint);
        System.out.println("Rectangle contains rectangle: " + containsRectangle);
        System.out.println("Rectangle overlaps rectangle: " + overlaps);
    }
}

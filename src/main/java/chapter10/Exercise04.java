package chapter10;

public class Exercise04 {

    public static void main(String[] args) {
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(10, 30.5);
        double distance = point1.distance(point2);
        System.out.println("The distance between two points is: " + distance);
    }
}

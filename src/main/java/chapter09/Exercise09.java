package chapter09;

public class Exercise09 {

    public static void printPolygon(RegularPolygon polygon){
        System.out.printf("The area of polygon is: %.1f, the perimeter of polygon is %.1f\n",
                polygon.getArea(), polygon.getPerimeter());
    }

    public static void main(String[] args) {
        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6,4);
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        printPolygon(polygon1);
        printPolygon(polygon2);
        printPolygon(polygon3);

    }
}

package chapter13;

import chapter13.exercise01.GeometricObject;
import chapter13.exercise09.Circle;
import chapter13.exercise10.Rectangle;

public class Exercise12 {

    public static double sumArea(GeometricObject[] a){
        double areaSum = 0.0;
        for (int i = 0; i<a.length; i++){
            GeometricObject geometricObject = a[i];
            areaSum += geometricObject.getArea();
        }
        return areaSum;
    }

    public static void main(String[] args) {
        GeometricObject[] geometricObjects = new GeometricObject[4];
        geometricObjects[0] = new Circle(10);
        geometricObjects[1] = new Rectangle(14, 5);
        geometricObjects[2] = new Rectangle(6.4, 8.5);
        geometricObjects[3] = new Circle(9.5);

        double result = sumArea(geometricObjects);
        System.out.println("Sum of areas is " + result);
    }
}

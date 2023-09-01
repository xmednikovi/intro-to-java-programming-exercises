package chapter13.exercise07;

import chapter13.exercise05.Circle;
import chapter13.exercise05.GeometricObject;
import chapter13.exercise05.Rectangle;

public class Exercise07 {

    public static void main(String[] args) {
        GeometricObject[] geometricObjects = new GeometricObject[5];
        geometricObjects[0] = new Circle(5);
        geometricObjects[1] = new Circle(12);
        geometricObjects[2] = new Rectangle(4, 5);
        geometricObjects[3] = new Square(5);
        geometricObjects[4] = new Square(6);

        for (int i = 0; i<5; i++){
            GeometricObject o = geometricObjects[i];
            System.out.println("The area of the geometric object " + i + " is " + o.getArea());
            if (o instanceof Colorable){
                Colorable colorable = (Colorable) o;
                colorable.howToColor();
            }
        }
    }
}

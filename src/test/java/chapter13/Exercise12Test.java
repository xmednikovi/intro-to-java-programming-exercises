package chapter13;

import chapter13.exercise01.GeometricObject;
import chapter13.exercise09.Circle;
import chapter13.exercise10.Rectangle;
import org.junit.Assert;
import org.junit.Test;

public class Exercise12Test {

    @Test
    public void sumAreaTest(){
        GeometricObject[] geometricObjects = new GeometricObject[4];
        geometricObjects[0] = new Circle(10);
        geometricObjects[1] = new Rectangle(14, 5);
        geometricObjects[2] = new Rectangle(6.4, 8.5);
        geometricObjects[3] = new Circle(9.5);

        double result = Exercise12.sumArea(geometricObjects);

        Assert.assertEquals(722, Math.round(result));
    }
}

package chapter10;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class Exercise11Test {

    @Test
    public void getAreaTest(){
        Circle2D circle2D = new Circle2D(0,0, 7);
        double area = circle2D.getArea();
        Assert.assertEquals(154, Math.round(area));
    }

    @Test
    public void getPerimeterTest(){
        Circle2D circle2D = new Circle2D(0,0, 9);
        double perimeter = circle2D.getPerimeter();
        Assert.assertEquals(57, Math.round(perimeter));
    }

    @Test
    @Ignore
    public void containsPointTest(){
        Circle2D circle = new Circle2D(-2, 1, 3);
        boolean containsPoint = circle.contains(-4, 3);
        Assert.assertTrue(containsPoint);
    }

    @Test
    @Ignore
    public void containsCircleTest(){
        Circle2D circle1 = new Circle2D(3, 4, 5);
        Circle2D circle2 = new Circle2D(14, 18, 8);
        boolean containsCircle = circle1.contains(circle2);
        Assert.assertFalse(containsCircle);
    }

}

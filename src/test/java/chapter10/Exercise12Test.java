package chapter10;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class Exercise12Test {

    @Test
    public void getPerimeterTest(){
        Triangle2D triangle2D = new Triangle2D(
                new MyPoint(5,5),
                new MyPoint(1,7),
                new MyPoint(3,2)
        );
        double perimeter = triangle2D.getPerimeter();
        Assert.assertEquals(13.46, perimeter, 0.01);
    }

    @Test
    public void getAreaTest(){
        Triangle2D triangle2D = new Triangle2D(
                new MyPoint(-3, -5),
                new MyPoint(-8, 5),
                new MyPoint(1, 2)
        );
        double area = triangle2D.getArea();
        Assert.assertEquals(37.5, area, 0.01);
    }

    @Test
    public void containsPointTest(){
        Triangle2D triangle = new Triangle2D(
                new MyPoint(),
                new MyPoint(10,30),
                new MyPoint(20,0)
        );
        MyPoint point = new MyPoint(10, 15);
        boolean contains = triangle.contains(point);
        Assert.assertTrue(contains);
    }

    @Test
    @Ignore
    public void containsTriangleTest(){

    }

    @Test
    @Ignore
    public void overlapsTriangleTest(){

    }
}

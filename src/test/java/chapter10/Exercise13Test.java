package chapter10;

import org.junit.Assert;
import org.junit.Test;

public class Exercise13Test {

    @Test
    public void getAreaTest(){
        MyRectangle2D rectangle = new MyRectangle2D(0,0, 5, 6);
        double area = rectangle.getArea();
        Assert.assertEquals(30, Math.round(area));
    }

    @Test
    public void getPerimeterTest(){
        MyRectangle2D rectangle = new MyRectangle2D(0,0, 5, 6);
        double perimeter = rectangle.getPerimeter();
        Assert.assertEquals(22, Math.round(perimeter));
    }

    @Test
    public void containsPointTest(){
        MyRectangle2D rectangle = new MyRectangle2D(0, 0, 6, 8);
        boolean contains = rectangle.contains(3, 2);
        Assert.assertTrue(contains);
    }

    @Test
    public void containsRectangleTest(){
        MyRectangle2D rectangle1 = new MyRectangle2D(0,0, 10, 20);
        MyRectangle2D rectangle2 = new MyRectangle2D(12, 15, 2, 3);
        boolean contains = rectangle2.contains(rectangle1);
        Assert.assertFalse(contains);

    }

    @Test
    public void overlapsRectangleTest(){
        MyRectangle2D r1 =  new MyRectangle2D (2, 2, 5.5, 4.9);
        boolean overlaps = r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4));
        Assert.assertTrue(overlaps);
    }
}

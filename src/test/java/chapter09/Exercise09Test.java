package chapter09;

import org.junit.Assert;
import org.junit.Test;

public class Exercise09Test {

    @Test
    public void getAreaTest(){
        RegularPolygon polygon = new RegularPolygon(5, 6);
        double area = polygon.getArea();
        Assert.assertEquals(61.94, area, 0.02);
    }

    @Test
    public void getPerimeterTest(){
        RegularPolygon polygon = new RegularPolygon(5, 10);
        double perimeter = polygon.getPerimeter();
        Assert.assertEquals(50.0, perimeter, 0);
    }
}

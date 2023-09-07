package chapter09;

import org.junit.Assert;
import org.junit.Test;

public class Exercise01Test {

    @Test
    public void getAreaTest(){
        Rectangle rectangle = new Rectangle(15, 20);
        Assert.assertEquals(300, Math.round(rectangle.getArea()));
    }

    @Test
    public void getPerimeterTest(){
        Rectangle rectangle = new Rectangle(12, 28);
        Assert.assertEquals(80, Math.round(rectangle.getPerimeter()));
    }
}

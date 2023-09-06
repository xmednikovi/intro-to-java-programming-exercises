package chapter06;

import org.junit.Assert;
import org.junit.Test;

public class Exercise19Test {

    @Test
    public void areaTest(){
        double result = Exercise19.area(23, 46, 41);
        Assert.assertEquals(470.9, result, 0.1);
    }

    @Test
    public void isValidTriangleTest(){
        // invalid triangle
        Assert.assertFalse(Exercise19.isValidTriangle(1, 10, 12));

        // valid triangle
        Assert.assertTrue(Exercise19.isValidTriangle(7, 10, 5));
    }
}

package chapter09;

import org.junit.Assert;
import org.junit.Test;


public class Exercise11Test {

    @Test
    public void hasSolutionsTest(){
        LinearEquation linearEquation = new LinearEquation(9.0, 4.0, 3.0, -5.0, -6.0, -21.0);
        Assert.assertTrue(linearEquation.isSolvable());
        Assert.assertEquals(-2.0, linearEquation.getX(), 0.1);
        Assert.assertEquals(3.0, linearEquation.getY(), 0.1);
    }

    @Test
    public void hasNoSolutionsTest(){
        LinearEquation linearEquation = new LinearEquation(1.0, 2.0, 2.0, 4.0, 4.0, 5.0);
        Assert.assertFalse(linearEquation.isSolvable());
    }
}

package chapter07;

import org.junit.Assert;
import org.junit.Test;

public class Exercise08Test {

    @Test
    public void averageIntTest(){
        int[] numbers = {10, 20, 30, 40, 50};
        int result = Exercise08.average(numbers);
        Assert.assertEquals(30, result);
    }

    @Test
    public void averageDoubleTest(){
        double[] numbers = {10.5, 20.5, 30.5, 40.5, 50.5};
        double result = Exercise08.average(numbers);
        Assert.assertEquals(30.5, result, 0.1);
    }
}

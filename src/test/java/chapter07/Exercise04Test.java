package chapter07;

import org.junit.Assert;
import org.junit.Test;

public class Exercise04Test {

    public final static int[] scores = {10, 20, 30, 40, 50};

    @Test
    public void getAverageTest(){
        double result = Exercise04.getAverage(scores);
        Assert.assertEquals(30, Math.round(result));
    }
}

package chapter07;

import org.junit.Assert;
import org.junit.Test;

public class Exercise09Test {

    @Test
    public void maxTest(){
        double[] numbers = {1.9, 2.5, 3.7, 2, 1.5, 6, 3, 4, 5, 2};
        double result = Exercise09.max(numbers);
        Assert.assertEquals(6, Math.round(result));
    }
}

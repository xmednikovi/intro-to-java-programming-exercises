package chapter06;

import org.junit.Assert;
import org.junit.Test;

public class Exercise11Test {

    @Test
    public void computeCommissionTest(){
        // commission for 25000 is 2200.0
        long result = Math.round(Exercise11.computeCommission(25000));
        Assert.assertEquals(2200, result);

    }
}

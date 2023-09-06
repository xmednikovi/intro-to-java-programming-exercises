package chapter06;

import org.junit.Assert;
import org.junit.Test;

public class Exercise07Test {

    @Test
    public void futureInvestmentValueTest(){
        // futureInvestmentValue(10000, 0.05/12, 5) returns 12833.59.
        double result = Exercise07.futureInvestmentValue(10000, 0.05/12, 5);
        Assert.assertEquals(12833.59, result, 0.02);
    }
}

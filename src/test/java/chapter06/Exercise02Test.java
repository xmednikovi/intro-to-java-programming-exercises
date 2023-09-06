package chapter06;

import org.junit.Assert;
import org.junit.Test;

public class Exercise02Test {

    @Test
    public void sumDigitsTest(){
        // sumDigits(234) returns 9
        int result = Exercise02.sumDigits(234);
        Assert.assertEquals(9, result);
    }
}

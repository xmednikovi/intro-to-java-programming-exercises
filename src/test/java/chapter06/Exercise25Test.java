package chapter06;

import org.junit.Assert;
import org.junit.Test;

public class Exercise25Test {

    @Test
    public void convertMillsTest(){
        String result1 = Exercise25.convertMills(5500);
        Assert.assertEquals("00:00:05", result1);

        String result2 = Exercise25.convertMills(100000);
        Assert.assertEquals("00:01:40", result2);
    }
}

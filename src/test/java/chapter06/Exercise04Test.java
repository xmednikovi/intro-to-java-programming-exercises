package chapter06;

import org.junit.Assert;
import org.junit.Test;

public class Exercise04Test {

    @Test
    public void reverseTest(){
        //reverse(3456) displays 6543

        int result = Exercise04.reverse(3456);
        Assert.assertEquals(6543, result);
    }
}

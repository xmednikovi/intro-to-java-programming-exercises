package chapter06;

import org.junit.Assert;
import org.junit.Test;

public class Exercise20Test {

    @Test
    public void countLettersTest(){
        String s = "Hello world";
        int result = Exercise20.countLetters(s);
        Assert.assertEquals(10, result);
    }
}

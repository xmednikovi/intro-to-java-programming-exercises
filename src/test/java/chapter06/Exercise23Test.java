package chapter06;

import org.junit.Assert;
import org.junit.Test;

public class Exercise23Test {

    @Test
    public void countTest(){
        int result = Exercise23.count("Welcome", 'e');
        Assert.assertEquals(2, result);
    }
}

package chapter44;

import org.junit.Assert;
import org.junit.Test;

public class Exercise01Test {

    @Test
    public void lengthTest(){
        String s = "Hello world";
        Assert.assertEquals(11, s.length());
    }

    @Test
    public void charAtTest(){
        String s = "Hello world";
        Assert.assertEquals('e', s.charAt(1));
    }

    @Test
    public void substringTest(){
        String s = "Hello world";
        Assert.assertEquals("world", s.substring(6));
    }

    @Test
    public void indexOfTest(){
        String s = "Hello world";
        Assert.assertEquals(4, s.indexOf("o"));
    }
}

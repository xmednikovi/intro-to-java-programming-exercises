package chapter10;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class Exercise28Test {

    @Test
    @Ignore
    public void insertTest(){
        MyStringBuilder2 msb1 = new MyStringBuilder2("Lorem ipsum");
        MyStringBuilder2 msb2 = new MyStringBuilder2("something ");
        MyStringBuilder2 result = msb1.insert(5, msb2);
        Assert.assertEquals("Lorem something ipsum", result.toString());
    }

    @Test
    public void reverseTest(){
        MyStringBuilder2 msb1 = new MyStringBuilder2("dcba");
        MyStringBuilder2 msb2 = msb1.reverse();
        Assert.assertEquals("abcd", msb2.toString());
    }

    @Test
    public void substringTest(){
        MyStringBuilder2 msb1 = new MyStringBuilder2("hello world");
        MyStringBuilder2 msb2 = msb1.substring(6);
        Assert.assertEquals("world", msb2.toString());
    }

    @Test
    public void toUpperCaseTest(){
        MyStringBuilder2 msb1 = new MyStringBuilder2("hello world");
        MyStringBuilder2 msb2 = msb1.toUpperCase();
        Assert.assertEquals("HELLO WORLD", msb2.toString());
    }
}

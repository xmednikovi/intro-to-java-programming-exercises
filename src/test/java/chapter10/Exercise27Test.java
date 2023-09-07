package chapter10;

import org.junit.Assert;
import org.junit.Test;

public class Exercise27Test {

    @Test
    public void appendTest(){
        MyStringBuilder1 myStringBuilder1 = new MyStringBuilder1("a");
        MyStringBuilder1 myStringBuilder2 = myStringBuilder1.append(new MyStringBuilder1("bc"));
        Assert.assertEquals("abc", myStringBuilder2.toString());
    }

    @Test
    public void lengthTest(){
        MyStringBuilder1 myStringBuilder1 = new MyStringBuilder1("abcd");
        Assert.assertEquals(4, myStringBuilder1.length());
    }

    @Test
    public void charAtTest(){
        MyStringBuilder1 myStringBuilder1 = new MyStringBuilder1("abcd");
        Assert.assertEquals('c', myStringBuilder1.charAt(2));
    }

    @Test
    public void substringTest(){
        MyStringBuilder1 myStringBuilder1 = new MyStringBuilder1("hello world");
        MyStringBuilder1 myStringBuilder2 = myStringBuilder1.substring(0, 5);
        Assert.assertEquals("hello", myStringBuilder2.toString());
    }
}

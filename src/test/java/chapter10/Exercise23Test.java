package chapter10;

import org.junit.Assert;
import org.junit.Test;

public class Exercise23Test {

    @Test
    public void substringTest(){
        MyString2 string1 = new MyString2("hello world");
        MyString2 result = string1.substring(6);
        Assert.assertEquals("world", result.toString());
    }

    @Test
    public void equalsTest(){
        MyString2 str2 = new MyString2("hello");
        MyString2 str3 = new MyString2("hello");
        Assert.assertEquals(str2, str3);
    }
}

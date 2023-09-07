package chapter10;

import org.junit.Assert;
import org.junit.Test;

public class Exercise22Test {

    @Test
    public void equalsTest(){
        char[] arr1 = {'a', 'b', 'c'};
        MyString1 string1 = new MyString1(arr1);
        MyString1 string2 = new MyString1("abc".toCharArray());
        Assert.assertEquals(string1, string2);
    }

    @Test
    public void toLowerCaseTest(){
        MyString1 myString1 = new MyString1("HELLO".toCharArray());
        MyString1 result = myString1.toLowerCase();
        Assert.assertEquals("hello", result.toString());
    }

    @Test
    public void substringTest(){
        MyString1 string1 = new MyString1("helloworld".toCharArray());
        MyString1 result = string1.substring(0,5);
        Assert.assertEquals("hello", result.toString());
    }
}

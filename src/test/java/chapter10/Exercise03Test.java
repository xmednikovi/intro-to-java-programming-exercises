package chapter10;

import org.junit.Assert;
import org.junit.Test;

public class Exercise03Test {

    @Test
    public void parseIntTest(){
        int integer = MyInteger.parseInt("50");
        Assert.assertEquals(50, integer);
    }

    @Test
    public void isOddTest(){
        MyInteger myInteger = new MyInteger(13);
        Assert.assertTrue(myInteger.isOdd());
    }

    @Test
    public void isEvenTest(){
        MyInteger myInteger = new MyInteger(16);
        Assert.assertTrue(myInteger.isEven());
    }

    @Test
    public void isPrimeTest(){
        MyInteger myInteger = new MyInteger(13);
        Assert.assertTrue(myInteger.isPrime());
    }
}

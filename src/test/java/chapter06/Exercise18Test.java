package chapter06;

import org.junit.Assert;
import org.junit.Test;

public class Exercise18Test {

    @Test
    public void isPasswordValidTest(){
        String goodPassword = "longpassword1234";
        String badPassword = "longnonumbers";
        Assert.assertTrue(Exercise18.isPasswordValid(goodPassword));
        Assert.assertFalse(Exercise18.isPasswordValid(badPassword));
    }
}

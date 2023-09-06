package chapter06;

import org.junit.Assert;
import org.junit.Test;

public class Exercise03Test {

    @Test
    public void reverseTest(){
        // reverse(456) returns 654
        int result = Exercise03.reverse(456);
        Assert.assertEquals(654, result);
    }

    @Test
    public void isPalindromeTest(){
        // return true if number is palindrome
        boolean result1 = Exercise03.isPalindrome(545);
        Assert.assertTrue(result1);

        // return false if number is not palindrome
        boolean result2 = Exercise03.isPalindrome(234);
        Assert.assertFalse(result2);

    }
}

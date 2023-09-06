package chapter06;

import org.junit.Assert;
import org.junit.Test;

import static chapter06.Exercise26.*;

public class Exercise26Test {

    @Test
    public void isPalindromeTest(){
        boolean isPalindrome = isPalindrome(5335);
        Assert.assertTrue(isPalindrome);

        boolean isNotPalindrome = isPalindrome(3253);
        Assert.assertFalse(isNotPalindrome);
    }

    @Test
    public void isPrimeTest(){
        boolean isPrime = isPrime(13);
        Assert.assertTrue(isPrime);

        boolean isNotPrime = isPrime(50);
        Assert.assertFalse(isNotPrime);
    }
}

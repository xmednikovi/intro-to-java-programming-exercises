package chapter06;

import org.junit.Assert;
import org.junit.Test;

public class Exercise10Test {

    @Test
    public void isPrimeTest(){
        // 11 is prime
        Assert.assertTrue(Exercise10.isPrime(11));

        // 31 is prime
        Assert.assertTrue(Exercise10.isPrime(31));

        // 20 is not prime
        Assert.assertFalse(Exercise10.isPrime(20));

        // 40 is not prime
        Assert.assertFalse(Exercise10.isPrime(40));
    }
}

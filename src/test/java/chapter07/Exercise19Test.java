package chapter07;

import org.junit.Assert;
import org.junit.Test;

public class Exercise19Test {

    @Test
    public void isSortedFalseTest(){
        int[] numbers = {10, 1, 5, 16, 61, 9, 11, 1};
        boolean isSorted = Exercise19.isSorted(numbers);
        Assert.assertFalse(isSorted);
    }

    @Test
    public void isSortedTrueTest(){
        int[] numbers = {21, 11, 9, 7, 5, 4, 4, 3, 1, 1};
        boolean isSorted = Exercise19.isSorted(numbers);
        Assert.assertTrue(isSorted);
    }
}

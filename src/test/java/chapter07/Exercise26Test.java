package chapter07;

import org.junit.Assert;
import org.junit.Test;

import static chapter07.Exercise26.*;
public class Exercise26Test {

    @Test
    public void isSortedTest(){
        int[] sortedNumbers = {2, 5, 6, 9, 10};
        boolean isSorted = isSorted(sortedNumbers);
        Assert.assertTrue(isSorted);
    }

    @Test
    public void isNotSortedTest(){
        int[] unsortedNumbers = {2, 5, 6, 1, 6};
        boolean isSorted = isSorted(unsortedNumbers);
        Assert.assertFalse(isSorted);
    }
}

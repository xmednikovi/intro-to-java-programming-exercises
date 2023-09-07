package chapter07;

import org.junit.Assert;
import org.junit.Test;

import static chapter07.Exercise27.*;

public class Exercise27Test {

    @Test
    public void isSortedConstantIntervalTest(){
        int[] numbers = {2,4,6,8,10};
        boolean isSorted = isSortedConstantInterval(numbers);
        Assert.assertTrue(isSorted);
    }

    @Test
    public void isNotSortedConstantIntervalTest(){
        int[] numbers = {2, 5, 6, 9, 10};
        boolean isSorted = isSortedConstantInterval(numbers);
        Assert.assertFalse(isSorted);
    }
}

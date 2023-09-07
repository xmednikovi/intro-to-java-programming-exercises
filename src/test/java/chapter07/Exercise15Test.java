package chapter07;

import org.junit.Assert;
import org.junit.Test;

public class Exercise15Test {

    @Test
    public void isInArrayTest(){
        int[] numbers = {1, 5, 7, 8, 9};
        Assert.assertTrue(Exercise15.isInArray(numbers, 8));
        Assert.assertFalse(Exercise15.isInArray(numbers, 12));
    }
    @Test
    public void eliminateDuplicatesTest(){
        int[] numbers = {1, 2, 3, 2, 1, 6, 3, 4, 5, 2};
        final int[] expectedResult = {1, 2, 3, 6, 4, 5};

        int[] result = Exercise15.eliminateDuplicates(numbers);
        Assert.assertArrayEquals(expectedResult, result);
    }
}

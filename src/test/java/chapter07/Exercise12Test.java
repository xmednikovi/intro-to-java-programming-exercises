package chapter07;

import org.junit.Assert;
import org.junit.Test;

public class Exercise12Test {

    @Test
    public void reverseTest(){
        final double[] expectedResult = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        double[] initial = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double[] result = new double[initial.length];
        Exercise12.reverse(initial, result, initial.length);
        Assert.assertArrayEquals(expectedResult, result, 0);
    }
}

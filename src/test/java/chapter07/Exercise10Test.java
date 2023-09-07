package chapter07;

import org.junit.Assert;
import org.junit.Test;

public class Exercise10Test {

    @Test
    public void indexOfLargestElementTest(){
        double[] numbers = {15, 20, 35,  400, 28, 9};
        int result = Exercise10.indexOfLargestElement(numbers);
        Assert.assertEquals(3, result);
    }
}

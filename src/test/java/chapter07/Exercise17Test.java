package chapter07;

import org.junit.Assert;
import org.junit.Test;

public class Exercise17Test {

    @Test
    public void findLargestIndexTest(){
        int[] numbers = {1, 23, 6, 91, 209, 68};
        int result = Exercise17.findLargestIndex(numbers);
        Assert.assertEquals(4, result);
    }
}

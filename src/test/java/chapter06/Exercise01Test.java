package chapter06;

import org.junit.Assert;
import org.junit.Test;

public class Exercise01Test {

    @Test
    public void getPentagonalNumberTest(){
        // getPentagonalNumber(1) should return 1
        int result1 = Exercise01.getPentagonalNumber(1);
        Assert.assertEquals(1, result1);

        // getPentagonalNumber(2) should return 5.
        int result2 = Exercise01.getPentagonalNumber(2);
        Assert.assertEquals(5, result2);
    }
}

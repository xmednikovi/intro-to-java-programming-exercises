package chapter06;

import org.junit.Assert;
import org.junit.Test;

import static chapter06.Exercise09.*;

public class Exercise09Test {

    @Test
    public void poundToKilogramTest(){

        // 20 pounds are 9.09 kg
        double result1 = poundToKilogram(20);
        Assert.assertEquals(9.09, result1, 0.2);

        // 25 pounds are 11.34 kg
        double result2 = poundToKilogram(25);
        Assert.assertEquals(11.34, result2, 0.2);

        // 510 pounds are 231.33 kg
        double result3 = poundToKilogram(510);
        Assert.assertEquals(231.33, result3, 0.2);


        // 515 pounds are 233.6 kg
        double result4 = poundToKilogram(515);
        Assert.assertEquals(233.6, result4, 0.2);

    }

    @Test
    public void kilogramToPoundTest(){

        // 1 kg is 2.2 pounds
        double result1 = kilogramToPound(1);
        Assert.assertEquals(2.2, result1, 0.1);

        // 3 kg are 6.6 pounds
        double result2 = kilogramToPound(3);
        Assert.assertEquals(6.6, result2, 0.1);

    }
}

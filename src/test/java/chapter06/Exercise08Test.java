package chapter06;

import org.junit.Assert;
import org.junit.Test;

public class Exercise08Test {

    @Test
    public void mileToKilometerTest(){
        // 2miles are  3.2km
        double result1 = Exercise08.mileToKilometer(2);
        Assert.assertEquals(3.2, result1, 0.01);

        // 9miles are  14.4 km
        double result2 = Exercise08.mileToKilometer(9);
        Assert.assertEquals(14.4, result2, 0.01);

        // 10miles are 16.0 km
        double result3 = Exercise08.mileToKilometer(10);
        Assert.assertEquals(16.0, result3, 0.01);
    }

    @Test
    public void kilometerToMileTest(){
        //20 km are 12.43 miles
        double result1 = Exercise08.kilometerToMile(20);
        Assert.assertEquals(12.43, result1, 0.2);

        //25 km are 15.538 miles
        double result2 = Exercise08.kilometerToMile(25);
        Assert.assertEquals(15.538, result2, 0.2);

        //60 km are 37.290 miles
        double result3 = Exercise08.kilometerToMile(60);
        Assert.assertEquals(37.29, result3, 0.2);
    }
}

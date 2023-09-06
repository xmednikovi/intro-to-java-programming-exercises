package chapter06;

import org.junit.Assert;
import org.junit.Test;

public class Exercise16Test {

    @Test
    public void numberOfDaysInAYearTest(){
        // 2014 has 365 days
        Assert.assertEquals(365, Exercise16.numberOfDaysInAYear(2014));

        // 2034 has 365 days
        Assert.assertEquals(365, Exercise16.numberOfDaysInAYear(2034));
    }
}

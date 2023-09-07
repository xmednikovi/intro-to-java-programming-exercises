package chapter10;

import org.junit.Assert;
import org.junit.Test;

public class Exercise04Test {

    @Test
    public void distanceTest(){
        MyPoint point1 = new MyPoint(4.0, 3.0);
        MyPoint point2 = new MyPoint();
        double distance = point1.distance(point2);
        Assert.assertEquals(5, distance, 0);

    }
}

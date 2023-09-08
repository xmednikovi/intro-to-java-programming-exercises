package chapter12;

import chapter12.exercise05.IllegalTriangleException;
import chapter12.exercise05.Triangle;
import org.junit.Test;

public class Exercise05Test {

    @Test(expected = IllegalTriangleException.class)
    public void sumOfTwoSidesIsGreaterThanOtherSideTest() throws IllegalTriangleException{
        Triangle triangle = new Triangle(10, 3, 3);
    }
}

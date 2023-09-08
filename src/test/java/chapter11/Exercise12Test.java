package chapter11;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class Exercise12Test {

    @Test
    public void sumTest(){
        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(10.0);
        numbers.add(20.0);
        numbers.add(30.0);
        numbers.add(40.0);
        numbers.add(50.0);
        double result = Exercise12.sum(numbers);
        Assert.assertEquals(150, Math.round(result));
    }
}

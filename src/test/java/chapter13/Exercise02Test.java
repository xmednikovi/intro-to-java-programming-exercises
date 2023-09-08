package chapter13;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Exercise02Test {

    @Test
    public void averageTest(){
        ArrayList<Integer> numbers = new ArrayList<>(List.of(10, 20, 30, 40, 50, 60, 70, 80,90,100));
        int result = Exercise02.average(numbers);
        Assert.assertEquals(55, result);
    }
}

package chapter11;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class Exercise04Test {

    @Test
    public void maxTest(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(9);
        numbers.add(35);
        numbers.add(17);
        Integer result = Exercise04.max(numbers);
        Assert.assertEquals(Integer.valueOf(35), result);
    }
}

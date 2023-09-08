package chapter11;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Exercise13Test {

    @Test
    public void removeDuplicateTest(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(List.of(34, 5, 3, 5, 6, 4, 33, 2, 2, 4));

        Assert.assertEquals(10, numbers.size());

        Exercise13.removeDuplicate(numbers);

        Assert.assertEquals(7, numbers.size());
    }
}

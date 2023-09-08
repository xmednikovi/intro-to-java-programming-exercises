package chapter11;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Exercise14Test {

    @Test
    public void unionTest(){
        ArrayList<Integer> list1 = new ArrayList<>(List.of(3,5,45,4,3));
        ArrayList<Integer> list2 = new ArrayList<>(List.of(33,51,5,4,13));
        ArrayList<Integer> result = Exercise14.union(list1, list2);
        Assert.assertEquals(10, result.size());
    }
}

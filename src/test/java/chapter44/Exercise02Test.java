package chapter44;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.List;

public class Exercise02Test {

    //add, remove, addAll, removeAll, size of java.util.HashSet

    private HashSet<Integer> numbers;

    @Before
    public void setup(){
        numbers = new HashSet<>();
    }

    @Test
    public void addTest(){
        numbers.add(10);
        numbers.add(15);
        numbers.add(25);
        Assert.assertTrue(numbers.contains(Integer.valueOf(10)));
        Assert.assertTrue(numbers.contains(Integer.valueOf(15)));
        Assert.assertTrue(numbers.contains(Integer.valueOf(25)));
    }

    @Test
    public void removeTest(){
        numbers.add(10);
        numbers.add(15);
        numbers.add(25);
        boolean result = numbers.remove(Integer.valueOf(25));
        Assert.assertTrue(result);
        Assert.assertFalse(numbers.contains(25));
    }

    @Test
    public void addAllTest(){
        List<Integer> numbers2 = List.of(30,40,50);
        numbers.add(12);
        numbers.add(255);

        boolean result = numbers.addAll(numbers2);
        Assert.assertTrue(result);
        Assert.assertEquals(5, numbers.size());
    }

    @Test
    public void removeAllTest(){
        List<Integer> numbers2 = List.of(30,40,50);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(45);
        boolean result = numbers.removeAll(numbers2);
        Assert.assertTrue(result);
        Assert.assertEquals(1, numbers.size());
    }

    @Test
    public void sizeTest(){
        numbers.add(1);
        Assert.assertEquals(1, numbers.size());
    }
}

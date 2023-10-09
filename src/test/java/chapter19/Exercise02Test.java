package chapter19;

import chapter19.exercise02.GenericStack;
import org.junit.Assert;
import org.junit.Test;

public class Exercise02Test {

    @Test
    public void addElementsToStackTest(){
        GenericStack<Integer> stack = new GenericStack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        Assert.assertEquals(4, stack.getSize());
    }

    @Test
    public void removeLastElementFromStackTest(){
        GenericStack<Integer> stack = new GenericStack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        Integer last = stack.pop();
        Assert.assertEquals(Integer.valueOf(40), last);
        Assert.assertEquals(3, stack.getSize());
    }

    @Test
    public void removeLastElementFromEmptyStackTest(){
        GenericStack<Integer> stack = new GenericStack<>();
        Integer last = stack.pop();
        Assert.assertNull(last);
    }

    @Test
    public void increaseStackCapacityTest(){
        GenericStack<Integer> stack = new GenericStack<>();
        for (int i = 0; i < 20; i ++ ){
            stack.push(i);
        }
        Assert.assertEquals(20, stack.getSize());
    }

    @Test
    public void peekTest(){
        GenericStack<Integer> stack = new GenericStack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        Integer last = stack.peek();
        Assert.assertEquals(4, stack.getSize());
        Assert.assertEquals(Integer.valueOf(40), last);
    }
}

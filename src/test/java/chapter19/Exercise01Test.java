package chapter19;

import chapter19.exercise01.ArrayStack;
import org.junit.Assert;
import org.junit.Test;

public class Exercise01Test {

    @Test
    public void addElementsToStackTest(){
        ArrayStack<Integer> stack = new ArrayStack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        Assert.assertEquals(4, stack.getSize());
    }

    @Test
    public void removeLastElementFromStackTest(){
        ArrayStack<Integer> stack = new ArrayStack<>();
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
        ArrayStack<Integer> stack = new ArrayStack<>();
        Integer last = stack.pop();
        Assert.assertNull(last);
    }

    @Test
    public void increaseStackCapacityTest(){
        ArrayStack<Integer> stack = new ArrayStack<>();
        for (int i = 0; i < 20; i ++ ){
            stack.push(i);
        }
        Assert.assertEquals(20, stack.getSize());
    }

    @Test
    public void peekTest(){
        ArrayStack<Integer> stack = new ArrayStack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        Integer last = stack.peek();
        Assert.assertEquals(4, stack.getSize());
        Assert.assertEquals(Integer.valueOf(40), last);
    }
}

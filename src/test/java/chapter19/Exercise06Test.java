package chapter19;

import chapter19.exercise06.Association;
import chapter19.exercise06.Transition;
import org.junit.Assert;
import org.junit.Test;

public class Exercise06Test {

    @Test
    public void associationTest(){
        Association<Integer, String> association = new Association<>(10, "Hello");
        Assert.assertEquals(Integer.valueOf(10), association.getElement1());
        Assert.assertEquals("Hello", association.getElement2());
    }

    @Test
    public void transitionTest(){
        Transition<Integer, String, Double> transition = new Transition<>(50, "Hello", 1.0d);
        Assert.assertEquals(Integer.valueOf(50), transition.getElement1());
        Assert.assertEquals("Hello", transition.getElement2());
        Assert.assertEquals(Double.valueOf(1.0d), transition.getElement3());
    }
}

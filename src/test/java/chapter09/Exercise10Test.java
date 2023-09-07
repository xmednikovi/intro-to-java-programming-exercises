package chapter09;

import org.junit.Assert;
import org.junit.Test;

public class Exercise10Test {


    @Test
    public void solveQuadratic2RootsTest(){
        QuadraticEquation quadraticEquation = new QuadraticEquation(1, -7, 10);
        Assert.assertEquals(2, quadraticEquation.getNumberOfRoots());
    }

    @Test
    public void solveQuadratic1RootTest(){
        QuadraticEquation quadraticEquation = new QuadraticEquation(1,8,16);
        Assert.assertEquals(1, quadraticEquation.getNumberOfRoots());
    }

    @Test
    public void solveQuadraticNoRootsTest(){
        QuadraticEquation quadraticEquation = new QuadraticEquation(1, -3, 4);
        Assert.assertEquals(0, quadraticEquation.getNumberOfRoots());
    }
}

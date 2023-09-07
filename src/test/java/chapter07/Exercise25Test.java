package chapter07;

import org.junit.Assert;
import org.junit.Test;

import static chapter07.Exercise25.*;

public class Exercise25Test {

    @Test
    public void solveQuadratic2RootsTest(){
        double[] eqn = {1, -7, 10};
        double[] roots = new double[2];
        int numberOfRoots = solveQuadratic(eqn, roots);
        Assert.assertEquals(2, numberOfRoots);
    }

    @Test
    public void solveQuadratic1RootTest(){
        double[] eqn = {1, 8, 16};
        double[] roots = new double[2];
        int numberOfRoots = solveQuadratic(eqn, roots);
        Assert.assertEquals(1, numberOfRoots);
    }

    @Test
    public void solveQuadraticNoRootsTest(){
        double[] eqn = {1, -3, 4};
        double[] roots = new double[2];
        int numberOfRoots = solveQuadratic(eqn, roots);
        Assert.assertEquals(0, numberOfRoots);
    }
}

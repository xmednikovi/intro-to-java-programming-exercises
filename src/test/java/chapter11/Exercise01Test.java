package chapter11;

import chapter11.exercise01.GeometricObject;
import chapter11.exercise01.Triangle;
import org.junit.Assert;
import org.junit.Test;

public class Exercise01Test {

    @Test
    public void isGeometricObjectTest(){
        Triangle triangle = new Triangle();
        Assert.assertTrue(triangle instanceof GeometricObject);
    }

    @Test
    public void getAreaTest(){
        Triangle triangle = new Triangle(5, 5, 5);
        double area = triangle.getArea();
        Assert.assertEquals(10.825, area, 0.01);
    }

    @Test
    public void getPerimeterTest(){
        Triangle triangle = new Triangle(5, 5, 5);
        double perimeter = triangle.getPerimeter();
        Assert.assertEquals(15, Math.round(perimeter));
    }
}

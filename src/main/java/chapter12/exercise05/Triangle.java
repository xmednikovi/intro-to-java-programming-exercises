package chapter12.exercise05;

import chapter11.exercise01.GeometricObject;

public class Triangle extends GeometricObject {

    private double side1, side2, side3;

    public Triangle(){
        super();
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException{
        if (side1 + side2 > side3){
            throw new IllegalTriangleException();
        }
        if (side2 + side3 > side1) {
            throw new IllegalTriangleException();
        }
        if (side1 + side3 > side2){
            throw new IllegalTriangleException();
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getArea(){
        double s = this.getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter(){
        return this.side1 + this.side2 + this.side3;
    }

    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
}

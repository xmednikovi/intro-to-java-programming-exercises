package chapter13.exercise09;

import chapter13.exercise01.GeometricObject;

public class Circle extends GeometricObject implements Comparable<Circle> {

    private double radius;

    public Circle(){
        super();
        radius = 1.0;
    }

    public Circle(double radius){
        super();
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getDiameter(){
        return this.radius / 2;
    }

    @Override
    public int compareTo(Circle o) {
        if (this.radius > o.radius){
            return 1;
        } else if (this.radius < o.radius){
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Circle){
            Circle c = (Circle) obj;
            return this.radius == c.radius;
        } else {
            return false;
        }
    }
}

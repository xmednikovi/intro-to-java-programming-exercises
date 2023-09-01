package chapter13.exercise06;

import chapter13.exercise01.GeometricObject;

public class ComparableCircle extends GeometricObject
        implements Comparable<ComparableCircle> {

    private double radius;

    public ComparableCircle(){
        super();
        this.radius = 1.0;
    }

    public ComparableCircle(double radius){
        super();
        this.radius = radius;
    }

    public double getDiameter(){
        return this.radius / 2;
    }
    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (this.getArea() > o.getArea()) {
            return 1;
        } else if (this.getArea() < o.getArea()){
            return -1;
        } else {
            return 0;
        }
    }
}

package chapter13.exercise10;

import chapter13.exercise01.GeometricObject;

public class Rectangle extends GeometricObject implements Comparable<Rectangle> {

    private double height, width;

    public Rectangle(){
        super();
        this.height = 1;
        this.width = 1;
    }

    public Rectangle(double height, double width){
        super();
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return this.height * this.width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.height + this.width);
    }

    @Override
    public int compareTo(Rectangle o) {
        if (getArea() > o.getArea()) {
            return 1;
        } else if (getArea() < o.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rectangle){
            Rectangle r = (Rectangle) obj;
            return r.getArea() == getArea();
        } else {
            return false;
        }
    }
}

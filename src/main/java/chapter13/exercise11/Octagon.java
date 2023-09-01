package chapter13.exercise11;

import chapter13.exercise01.GeometricObject;

public class Octagon extends
        GeometricObject implements Comparable<Octagon>, Cloneable {

    private double side;

    public Octagon(){
        this.side = 0;
    }

    public Octagon(double side){
        this.side = side;
    }

    @Override
    public double getArea() {
        return this.side * this.side * (2 + 4 / Math.sqrt(2));
    }

    @Override
    public double getPerimeter() {
        return 8 * this.side;
    }


    @Override
    public int compareTo(Octagon o) {
        if (this.side > o.side){
            return 1;
        } else if (this.side < o.side) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Octagon){
            Octagon oct = (Octagon) obj;
            return this.side == oct.side;
        } else {
            return false;
        }
    }

    @Override
    protected Object clone()  {
        try {
            return super.clone();
        } catch (CloneNotSupportedException ex){
            return null;
        }
    }
}

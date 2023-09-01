package chapter13.exercise05;

import java.util.Date;

public abstract class GeometricObject implements Comparable<GeometricObject> {

    private String color;
    private boolean filled;
    private Date dateCreated;

    protected GeometricObject(){
        this.dateCreated = new Date();
    }

    protected GeometricObject(String color, boolean filled){
        this();
        this.filled = filled;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public static GeometricObject max(GeometricObject obj1, GeometricObject obj2){
        if (obj1.compareTo(obj2) > 0) {
            return obj1;
        } else {
            return obj2;
        }
    }

    @Override
    public int compareTo(GeometricObject o) {
        if (getArea() > o.getArea()){
            return 1;
        } else if (getArea() < o.getArea()){
            return -1;
        } else {
            return 0;
        }
    }
}

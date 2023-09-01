package chapter13.exercise01;

import java.util.Date;

public abstract class GeometricObject {

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
}

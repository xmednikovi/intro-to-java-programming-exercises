package chapter11.exercise01;

import java.util.Date;

public class GeometricObject {

    private String color;
    private boolean filled;
    private Date dateCreated;

    public GeometricObject(){
        this.dateCreated = new Date();
    }

    public GeometricObject(String color, boolean filled){
        this();
        this.filled = filled;
        this.color = color;
    }

    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color +
                " and filled: " + filled;
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
}

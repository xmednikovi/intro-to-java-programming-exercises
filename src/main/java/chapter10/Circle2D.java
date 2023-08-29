package chapter10;

public class Circle2D {

    private double x;
    private double y;
    private double radius;

    public Circle2D(){
        this.x = 0;
        this.y = 0;
        this.radius = 1;
    }

    public Circle2D(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public boolean contains (double x, double y){
        double distance = Math.sqrt(Math.pow(this.x - x,2) + Math.pow(this.y - y,2));
        return distance < this.radius;
    }

    public boolean contains (Circle2D anotherCircle){
        double distance = Math.sqrt(Math.pow(this.x - anotherCircle.getX(),2)
                + Math.pow(this.y - anotherCircle.getY(),2));
        boolean isOverlaped = this.overlaps(anotherCircle);
        boolean aContainsB = this.radius > distance + anotherCircle.getRadius();
        boolean bContainsA = anotherCircle.getRadius() > distance + this.radius;
        return !aContainsB && !bContainsA && isOverlaped;
    }

    public boolean overlaps (Circle2D anotherCircle){
        double distance = Math.sqrt(Math.pow(this.x - anotherCircle.getX(),2)
                + Math.pow(this.y - anotherCircle.getY(),2));
        double sumOfRadius = this.radius + anotherCircle.getRadius();
        return distance <= sumOfRadius;
    }

    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }
}

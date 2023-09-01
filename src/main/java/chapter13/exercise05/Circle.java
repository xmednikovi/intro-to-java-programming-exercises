package chapter13.exercise05;

public class Circle extends GeometricObject {

    private double radius;

    public Circle(){
        super();
        this.radius = 5;
    }

    public Circle(double radius){
        super();
        this.radius = radius;
    }

    public double getDiameter(){
        return this.radius / 2;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
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
}

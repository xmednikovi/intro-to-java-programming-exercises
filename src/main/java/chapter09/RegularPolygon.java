package chapter09;

public class RegularPolygon {

    private int n;
    private double side;
    private double x;
    private double y;

    public RegularPolygon(){
        this.n = 3;
        this.side = 1;
        this.x = 0;
        this.y = 0;
    }

    public RegularPolygon(int numberOfSides, double lengthOfSide){
        this();
        this.n = numberOfSides;
        this.side = lengthOfSide;
    }

    public RegularPolygon(int numberOfSides, double lengthOfSide, double positionX, double positionY){
        this();
        this.n = numberOfSides;
        this.side = lengthOfSide;
        this.x = positionX;
        this.y = positionY;
    }

    public double getPerimeter(){
        return this.n * this.side;
    }

    public double getArea(){

        return (n * (Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n)));

    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}

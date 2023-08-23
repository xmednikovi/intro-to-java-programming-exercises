package chapter09;

class RegularPolygon {

    private int n;
    private double side;
    private double x;
    private double y;

    RegularPolygon(){
        this.n = 3;
        this.side = 1;
        this.x = 0;
        this.y = 0;
    }

    RegularPolygon(int numberOfSides, double lengthOfSide){
        this();
        this.n = numberOfSides;
        this.side = lengthOfSide;
    }

    RegularPolygon(int numberOfSides, double lengthOfSide, double positionX, double positionY){
        this();
        this.n = numberOfSides;
        this.side = lengthOfSide;
        this.x = positionX;
        this.y = positionY;
    }

    double getPerimeter(){
        return this.n * this.side;
    }

    double getArea(){
        double s = this.getPerimeter() / 2;
        return (this.n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / this.n));
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

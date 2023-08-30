package chapter10;

public class Triangle2D {

    private MyPoint p1;
    private MyPoint p2;
    private MyPoint p3;

    public Triangle2D() {
        this.p1 = new MyPoint();
        this.p2 = new MyPoint();
        this.p3 = new MyPoint();
    }

    public Triangle2D(MyPoint point1, MyPoint point2, MyPoint point3){
        this.p1 = point1;
        this.p2 = point2;
        this.p3 = point3;
    }

    public double getPerimeter() {
        double side1 = this.p1.distance(this.p2);
        double side2 = this.p1.distance(this.p3);
        double side3 = this.p2.distance(this.p3);
        return side1 + side2 + side3;
    }

    public double getArea() {
        return calculateArea(this.p1, this.p2, this.p3);
    }

    private double calculateArea (MyPoint a, MyPoint b, MyPoint c){
        double side1 = a.distance(b);
        double side2 = b.distance(c);
        double side3 = a.distance(c);
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public boolean contains (MyPoint point){
        double area = Math.round(this.getArea() * 100) / 100;
        double pabArea = calculateArea(point, this.p1, this.p2);
        double pbcArea = calculateArea(point, this.p2, this.p3);
        double pacArea = calculateArea(point, this.p1, this.p3);
        return area == (Math.round( (pbcArea + pacArea + pabArea) * 100 ) / 100);

    }

    public boolean contains (Triangle2D t){

        return this.contains(t.getP1()) && this.contains(t.getP2()) && this.contains(t.getP3());
    }

    public boolean overlaps (Triangle2D t){

        return this.contains(t.getP1()) || this.contains(t.getP2()) || this.contains(t.getP3());
    }

    public MyPoint getP1() {
        return p1;
    }

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }

    public MyPoint getP3() {
        return p3;
    }

    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }
}

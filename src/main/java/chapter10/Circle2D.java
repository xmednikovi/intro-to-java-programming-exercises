package chapter10;

class Circle2D {

    double x;
    double y;
    double radius;

    Circle2D(){
        this.x = 0;
        this.y = 0;
        this.radius = 1;
    }

    Circle2D(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    boolean contains (double x, double y){
        double distance = Math.sqrt(Math.pow(this.x - x,2) + Math.pow(this.y - y,2));
        return distance < this.radius;
    }

    boolean contains (Circle2D anotherCircle){
        double distance = Math.sqrt(Math.pow(this.x - anotherCircle.getX(),2) + Math.pow(this.y - anotherCircle.getY(),2));
        boolean isOverlaped = this.overlaps(anotherCircle);
        boolean aContainsB = this.radius > distance + anotherCircle.getRadius();
        boolean bContainsA = anotherCircle.getRadius() > distance + this.radius;
        return !aContainsB && !bContainsA && isOverlaped;
    }

    boolean overlaps (Circle2D anotherCircle){
        double distance = Math.sqrt(Math.pow(this.x - anotherCircle.getX(),2) + Math.pow(this.y - anotherCircle.getY(),2));
        double sumOfRadius = this.radius + anotherCircle.getRadius();
        return distance <= sumOfRadius;
    }

    double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }

    double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    double getRadius() {
        return radius;
    }
}

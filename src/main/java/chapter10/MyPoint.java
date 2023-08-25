package chapter10;

class MyPoint {

    private double x;
    private double y;

    MyPoint(){
        this.x = 0;
        this.y = 0;
    }

    MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    double distance (double x, double y){
        return Math.sqrt(Math.pow(this.x - x,2) + Math.pow(this.y - y,2));
    }

    double distance (MyPoint anotherPoint){
        return this.distance(anotherPoint.getX(), anotherPoint.getY());
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }
}

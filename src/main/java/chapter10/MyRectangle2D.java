package chapter10;

public class MyRectangle2D {

    private double x;
    private double y;
    private double width;
    private double height;

    public MyRectangle2D(){
        this.x = 0;
        this.y = 0;
        this.width = 1;
        this.height = 1;
    }

    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getPerimeter(){
        return 2 * (this.width + this.height);
    }

    public double getArea(){
        return this.width * this.height;
    }

    public boolean contains (double pX, double pY){
        double topLeftX = this.x - width / 2;
        double topLeftY = this.y + height / 2;
        double bottomRightX = this.x + width / 2;
        double bottomRightY = this.y - height / 2;
        return x > topLeftX && x < bottomRightX && y < topLeftY && y > bottomRightY;
    }

    public boolean contains (MyRectangle2D r){
        return (r.getX() + r.getHeight()) < (this.x + this.width)
                && r.getX() > this.x
                && r.getY() > this.y
                && (r.getY() + r.getHeight() < (this.y + this.height));
    }

    public boolean overlaps (MyRectangle2D r){
        double topLeftX1 = this.x - width / 2;
        double topLeftY1 = this.y + height / 2;
        double bottomRightX1 = this.x + width / 2;
        double bottomRightY1 = this.y - height / 2;

        double topLeftX2 = r.getX() - r.getWidth() / 2;
        double topLeftY2 = r.getY() + r.getHeight() / 2;
        double bottomRightX2 = r.getX() + r.getWidth() / 2;
        double bottomRightY2 = r.getY() - r.getHeight() / 2;
        return topLeftX1 < bottomRightX2 &&
                topLeftX2 < bottomRightX1
                && topLeftY1 > bottomRightY2 && topLeftY2 > bottomRightY1;

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

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}

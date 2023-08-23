package chapter09;

public class Rectangle {

        private double width;
        private double height;

        Rectangle() {
            this.width = 1;
            this.height = 1;
        }

        Rectangle(double width, double height){
            this.width = width;
            this.height = height;
        }

        double getArea() {
            return this.width * this.height;
        }

        double getPerimeter() {
            return 2 * (this.width + this.height);
        }
}

package chapter13.exercise07;

import chapter13.exercise05.GeometricObject;

public class Square extends GeometricObject implements Colorable {

    private double side;

    public Square(){
        super();
        this.side = 0;
    }

    public Square(double s){
        super();
        this.side = s;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public double getPerimeter() {
        return 4 * this.side;
    }



    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}

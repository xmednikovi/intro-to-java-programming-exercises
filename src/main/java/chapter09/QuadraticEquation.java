package chapter09;

public class QuadraticEquation {

    private double a, b, c;

    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant(){
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    public double getRoot1(){
        double discriminant = this.getDiscriminant();
        if (discriminant >= 0){
            return (-this.b + Math.sqrt(discriminant)) / (2 * this.a);
        } else {
            return 0.0;
        }
    }

    public double getRoot2(){
        double discriminant = this.getDiscriminant();
        if (discriminant >= 0){
            return (-this.b - Math.sqrt(discriminant)) / (2 * this.a);
        } else {
            return 0.0;
        }
    }

    public int getNumberOfRoots(){
        double discriminant = this.getDiscriminant();
        if (discriminant > 0){
            return 2;
        } else if (discriminant == 0){
            return 1;
        } else {
            return 0;
        }
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }


    public double getC() {
        return c;
    }

}

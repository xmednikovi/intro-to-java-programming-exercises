package chapter09;

public class LinearEquation {

    private double a,b,c,d,e,f;

    LinearEquation(double a, double b, double c, double d, double e, double f){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    boolean isSolvable(){
        double result = (this.a * this.d) - (this.b * this.c);
        return result != 0;
    }

    double getX(){
        return ( (this.e * this.d) - (this.b * this.f) ) / ( (this.a * this.d) - (this.b * this.c) );
    }

    double getY(){
        return ( (this.a * this.f) - (this.e * this.c) ) / ( (this.a * this.d) - (this.b * this.c));
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

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }
}

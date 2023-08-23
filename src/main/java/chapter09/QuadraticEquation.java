package chapter09;

class QuadraticEquation {

    double a, b, c;

    QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double getDiscriminant(){
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    double getRoot1(){
        double discriminant = this.getDiscriminant();
        if (discriminant >= 0){
            return (-this.b + Math.sqrt(discriminant)) / (2 * this.a);
        } else {
            return 0.0;
        }
    }

    double getRoot2(){
        double discriminant = this.getDiscriminant();
        if (discriminant >= 0){
            return (-this.b - Math.sqrt(discriminant)) / (2 * this.a);
        } else {
            return 0.0;
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

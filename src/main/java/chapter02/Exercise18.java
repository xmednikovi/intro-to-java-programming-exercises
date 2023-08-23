package chapter02;

public class Exercise18 {

    static double midpoint(double a, double b){
        return (a + b) / 2;
    }

    public static void main(String[] args){
        System.out.println("(" + midpoint(0,2) + "," + midpoint(0, 1) + ")");
        System.out.println("(" + midpoint(1,4) + "," + midpoint(4, 2) + ")");
        System.out.println("(" + midpoint(2,6) + "," + midpoint(7, 3) + ")");
        System.out.println("(" + midpoint(3,10) + "," + midpoint(9, 5) + ")");
        System.out.println("(" + midpoint(4,12) + "," + midpoint(11, 7) + ")");
    }
}

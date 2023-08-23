package chapter03;

import java.util.Scanner;

public class Exercise27 {

    public static double getArea(double x1, double y1, double x2, double y2, double x3, double y3){
        return (x1 * (y2-y3) + x2 * (y3-y1) + x3 *(y1-y2))/2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point's x and y: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        double area = getArea(0,0,0,100, 200, 0);
        double a1 = getArea(x,y, 0,0, 0,100);
        double a2 = getArea(x,y,0,100, 200,0);
        double a3 = getArea(x,y, 0,0, 200,0);
        if (a1+a2+a3 == area) {
            System.out.println("The point is in a triangle");
        } else {
            System.out.println("The point is not in a triangle");
        }
    }
}

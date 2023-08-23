package chapter09;

public class Exercise01 {



    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);
        System.out.println("The area of rectangle 1 is " + rectangle1.getArea());
        System.out.println("The area of rectangle 2 is " + rectangle2.getArea());
        System.out.println("The perimeter of rectangle 1 is "+ rectangle1.getPerimeter());
        System.out.println("The perimeter of rectangle 2 is " + rectangle2.getPerimeter());

    }
}

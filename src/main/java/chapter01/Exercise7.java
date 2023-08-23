package chapter01;

public class Exercise7 {

    public static void main(String[] args){
        double result1 = 4 * (1.0 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        double result2 = 4 * (1.0 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11) + (1.0/13));
        System.out.println("The result of first expression = " + result1);
        System.out.println("The result of second expression = " + result2);
    }
}

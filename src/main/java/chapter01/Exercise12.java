package chapter01;

public class Exercise12 {

    public static void main(String[] args){
        double distanceInKm = 24 * 1.6;
        double time = 1.0 + (40.0/60) + (35.0/3600);

        double result = distanceInKm / time;
        System.out.println("Average speed is " + result + " miles/h");
    }
}

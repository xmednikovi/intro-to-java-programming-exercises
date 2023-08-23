package chapter01;

public class Exercise10 {

    public static void main(String[] args) {
        final double distance = 15.0d;
        final double minutes = 50;
        final double seconds = 30;

        double time = (minutes / 60) + (seconds / 3600);

        double distanceInMiles = distance / 1.6;
        double speed = distanceInMiles / time;

        System.out.println("Average speed per hour is " + speed + " km/h");
    }
}

package chapter02;

public class ShowCurrentTime {

    public static void main(String[] args){
        long totalMilliseconds = System.currentTimeMillis();

        // total seconds
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;

        // total minutes
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;

        // total hours
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;

        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }
}

package chapter10;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(){
        long currentTime = System.currentTimeMillis();
        this.setTime(currentTime);
    }

    public Time(long ellapesedTime){
        this.setTime(ellapesedTime);
    }

    public Time (int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void setTime (long ellapsedTime){
        this.seconds = (int) (ellapsedTime / 1000) % 60;
        this.minutes = (int) (ellapsedTime / (1000 * 60) % 60);
        this.hours = (int) ((ellapsedTime / (1000*60*60)) % 24);
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}

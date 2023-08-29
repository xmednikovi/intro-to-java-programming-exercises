package chapter10;

import java.util.GregorianCalendar;

public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate (){
        GregorianCalendar calendar = new GregorianCalendar();
        this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
        this.month = calendar.get(GregorianCalendar.MONTH) + 1;
        this.year = calendar.get(GregorianCalendar.YEAR);
    }

    public MyDate (int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public MyDate (long ellapsedTime){
        this();
        this.setDate(ellapsedTime);
    }

    public void setDate(long ellapsedTime) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(ellapsedTime);
        this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
        this.month = calendar.get(GregorianCalendar.MONTH) + 1;
        this.year = calendar.get(GregorianCalendar.YEAR);
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return String.format("%02d.%02d.%4d", this.day, this.month, this.year);
    }
}

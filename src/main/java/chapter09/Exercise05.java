package chapter09;

import java.util.GregorianCalendar;

public class Exercise05 {

    public static void main(String[] args) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        System.out.printf("The current date is %2d.%02d.%4d\n",
                gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH),
                gregorianCalendar.get(GregorianCalendar.MONTH),
                gregorianCalendar.get(GregorianCalendar.YEAR));

        gregorianCalendar.setTimeInMillis(1234567898765L);
        System.out.printf("The updated date is %2d.%02d.%4d\n",
                gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH),
                gregorianCalendar.get(GregorianCalendar.MONTH),
                gregorianCalendar.get(GregorianCalendar.YEAR));
    }
}

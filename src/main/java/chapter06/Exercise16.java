package chapter06;

public class Exercise16 {

    public static int numberOfDaysInAYear(int year){
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 ==0);
        return isLeapYear ? 366 : 365;
    }

    public static void main(String[] args) {
        for (int year = 2014; year <= 2034; year ++ ){
            int numberOfDays = numberOfDaysInAYear(year);
            System.out.printf("The year of %4d has %3d days\n", year, numberOfDays);
        }
    }
}

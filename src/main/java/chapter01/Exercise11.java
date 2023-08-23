package chapter01;

public class Exercise11 {

    public static double convertToYears (double valueInSeconds) {
        final double secondsInYear = 86_400;
        double result = secondsInYear / valueInSeconds;
        return result;
    }

    public static void main(String[] args) {

        double birthPerYear = convertToYears(7.0);
        double deathPerYear = convertToYears(13.0);
        double immigrationPerYear = convertToYears(45.0);

        double currentPopulation = 312_032_486;

        for (int y = 1; y < 6; y++) {
            currentPopulation += birthPerYear - deathPerYear + immigrationPerYear;
            System.out.print("Population in " + y + " years would be ");
            System.out.printf("%1.0f", currentPopulation);
            System.out.print(" people \n");
        }
    }
}

package chapter08;

import java.util.Scanner;

public class Weather {

    final static int NUMBER_OF_DAYS = 10;
    final static int NUMBER_OF_HOURS = 24;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][][] weatherData = new double[NUMBER_OF_DAYS][NUMBER_OF_HOURS][2];

        // read input
        for (int i = 0; i < NUMBER_OF_DAYS * NUMBER_OF_HOURS; i++){
            int day = scanner.nextInt();
            int hour = scanner.nextInt();
            double temperature = scanner.nextDouble();
            double humidity = scanner.nextDouble();

            weatherData[day - 1][hour - 1][0] = temperature;
            weatherData[day - 1][hour -1][1] = humidity;
        }

        // find average daily
        for (int i = 0; i < NUMBER_OF_DAYS; i++){
            double dailyTemperatureTotal = 0;
            double dailyHumidityTotal = 0;
            for (int j = 0; j < NUMBER_OF_HOURS; j++){
                dailyTemperatureTotal += weatherData[i][j][0];
                dailyHumidityTotal += weatherData[i][j][1];
            }

            System.out.printf("Day %d's average temperature is %5.2f and average humidity is %5.2f\n",
                    i, dailyTemperatureTotal / NUMBER_OF_HOURS, dailyHumidityTotal / NUMBER_OF_HOURS);
        }
    }
}

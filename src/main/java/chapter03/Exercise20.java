package chapter03;

import java.util.Scanner;

public class Exercise20 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F:");
        double temperature = input.nextDouble();
        System.out.print("Enter the wind speed (>= 2) in miles per hour:");
        double windSpeed = input.nextDouble();

        if ( (temperature >= -58.0 && temperature <= 41.0) && windSpeed >=2){
            double v = Math.pow(windSpeed, 0.16);
            double result = 35.75 + 0.6215 * temperature - 35.75 * v + 0.4275 * temperature * v;

            System.out.println("The wind chill index is " + result);
        } else {
            System.out.println("The input is invalid");
        }


    }
}

package chapter05;

public class Exercise05 {

    public static void main(String[] args) {
        for (int celsius = 0, fahr = 20; celsius <= 100; celsius ++, fahr += 5){
            double fahrResult = celsius * ((double) 9/5) + 32;
            double celsiusResult = (fahr - 32) * 0.5556;
            System.out.printf("%-3d  %7.3f    %-3d  %6.3f\n", celsius, fahrResult, fahr, celsiusResult);
        }
    }
}

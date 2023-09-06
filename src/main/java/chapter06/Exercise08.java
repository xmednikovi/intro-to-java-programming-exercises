package chapter06;

public class Exercise08 {

    public static double mileToKilometer(double mile) {
        return mile * 1.6;
    }

    public static double kilometerToMile(double km){
        return km * 0.621;
    }

    public static void main(String[] args) {

        for (int mile = 1, km = 20; mile <= 10; mile++, km+=5) {
            double currentMileToKm = mileToKilometer(mile);
            double currentKmToMile = kilometerToMile(km);
            System.out.printf("%2d %5.3f %2d %5.3f\n", mile, currentMileToKm, km, currentKmToMile);
        }
    }
}

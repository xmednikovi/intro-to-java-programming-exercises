package chapter06;

public class Exercise09 {

    public static double poundToKilogram (double pound){
        return pound * 0.4535;
    }

    public static double kilogramToPound(double kg){
        return kg * 2.205;
    }

    public static void main(String[] args) {
        for (int kg = 1, pound = 20; kg <=199; kg +=2, pound +=5) {
            double kgToPound = kilogramToPound(kg);
            double poundToKg = poundToKilogram(pound);
            System.out.printf("%3d %4.1f %3d %5.2f\n", kg, kgToPound, pound, poundToKg);
        }
    }
}

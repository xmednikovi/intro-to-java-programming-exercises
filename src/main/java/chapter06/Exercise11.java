package chapter06;

public class Exercise11 {

    public static double computeCommission (double salesAmount){
        double commission = 0.0;
        if (salesAmount > 5000) {
            salesAmount -= 5000;
            commission += 5000 * 0.06;
        }
        if (salesAmount >= 5000) {
            salesAmount -= 5000;
            commission += 5000 * 0.08;
        }
        if (salesAmount > 0) {
            commission += salesAmount * 0.1;
        }
        return commission;
    }

    public static void main(String[] args) {
        for (int sale = 10000; sale <= 100000; sale +=5000) {
            double comission = computeCommission(sale);
            System.out.printf("%-7d %6.1f\n", sale, comission);
        }
    }
}

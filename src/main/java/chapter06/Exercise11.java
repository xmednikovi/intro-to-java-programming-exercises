package chapter06;

public class Exercise11 {

    public static double computeCommission (double salesAmount){
        double commission = 0.0d;

        if (salesAmount <= 5000) {
            return salesAmount * 0.06;
        }

        if (salesAmount > 5000 && salesAmount <= 10000){
            commission += (5000 * 0.06);
            commission += (salesAmount - 5000) * 0.08;
        } else {
            // higher than 10 000
            commission += (5000 * 0.06);
            commission += (5000 * 0.08);

            commission += (salesAmount - 10000) * 0.1;

        }

        return commission;
    }

    public static void main(String[] args) {
        for (int sale = 10000; sale <= 100000; sale +=5000) {
            double commission = computeCommission(sale);
            System.out.printf("%-7d %6.1f\n", sale, commission);
        }
    }
}

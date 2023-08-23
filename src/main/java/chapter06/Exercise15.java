package chapter06;

public class Exercise15 {

    public static double computeTax(int status, double taxableIncome){
        switch (status) {
            case 0:
                if (taxableIncome <= 8350) {
                    return taxableIncome * 0.1;
                } else if (taxableIncome <=33950) {
                    return 8350 * 0.1 + (taxableIncome - 8350) * 0.15;
                } else if (taxableIncome <=82250) {
                    return 8350 * 0.1 + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25;
                } else if (taxableIncome <= 171550) {
                    return 8350 * 0.1 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (taxableIncome - 82250) * 0.28;
                } else if (taxableIncome <=372950) {
                    return 8350 * 0.1 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
                            (taxableIncome - 171550) * 0.33;
                } else {
                    return 8350 * 0.1 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
                            (372950 - 171550) * 0.33 + (taxableIncome - 372950) * 0.35;
                }
            case 1:
                if (taxableIncome <= 16700) {
                    return taxableIncome * 0.1;
                } else if (taxableIncome <= 67900) {
                    return 16700 * 0.1 + (taxableIncome - 16700) * 0.15;
                } else if (taxableIncome <= 137_050) {
                    return 16_700 * 0.1 + (67_900 - 16_700) * 0.15 + (taxableIncome - 67_900) * 0.25;
                } else if (taxableIncome <=208_850){
                    return 16_700 * 0.1 + (67_900-16_700) * 0.15 + (137_050 - 67_900) * 0.25 + (taxableIncome - 137_050) * 0.28;
                } else if (taxableIncome <= 372_950) {
                    return 16_700 * 0.1 + (67_900 - 16_700) * 0.15 + (137_050 - 67_900) * 0.25 + (288_850 - 137_050) * 0.28 +
                            (taxableIncome - 208_850) * 0.33;
                } else {
                    return 16_700 * 0.1 + (67_900 - 16_700) * 0.15 + (137_050 - 67_900) * 0.25 + (288_850 - 137_050) * 0.28 +
                            (372_095 - 208_850) * 0.33 + (taxableIncome - 372950) * 0.35;
                }
            case 2:
                if (taxableIncome <= 8350) {
                    return taxableIncome * 0.1;
                } else if (taxableIncome <= 33_950) {
                    return 8350 * 0.1 + (taxableIncome - 8350) * 0.15;
                } else if (taxableIncome <= 68_525) {
                    return 8350 * 0.1 + (33_950-8350) * 0.15 + (taxableIncome - 33_950) * 0.25;
                } else if (taxableIncome <= 104_425) {
                    return 8350 * 0.1 + (33_950 - 8350) * 0.15 + (68_525 - 33_950) * 0.25 + (taxableIncome - 68_525) * 0.28;
                } else if (taxableIncome <= 186_475) {
                    return 8350 * 0.1 + (33_950 - 8350) * 0.15 + (68_525 - 33_950) * 0.25 + (104_425 - 68_525) * 0.28 +
                            (taxableIncome - 104_425) * 0.33;
                } else {
                    return 8350 * 0.1 + (33_950 - 8350) * 0.15 + (68_525 - 33_950) * 0.25 + (104_425 - 68_525) * 0.28 +
                            (186_475 - 104_425) * 0.33 + (taxableIncome - 186_475) * 0.35;
                }
            case 3:
                if (taxableIncome <= 11_950) {
                    return taxableIncome * 0.1;
                } else if (taxableIncome <=45_500) {
                    return 11_950 * 0.1 + (taxableIncome - 11_950) * 0.15;
                } else if (taxableIncome <= 117_450) {
                    return 11_950 * 0.1 + (45_500 - 11_950) * 0.15 + (taxableIncome - 45_500) * 0.25;
                } else if (taxableIncome <= 190_200) {
                    return 11_950 * 0.1 + (45_500 - 11_950) * 0.15 + (117_450 - 45_500) * 0.25
                            + (taxableIncome - 117_450) * 0.28;
                } else if (taxableIncome <= 372_950) {
                    return 11_950 * 0.1 + (45_500 - 11_950) * 0.15 + (117_450 - 45_500) * 0.25
                            + (190_200 - 117_450) * 0.28 + (taxableIncome - 190_200) * 0.33;
                } else {
                    return 11_950 * 0.1 + (45_500 - 11_950) * 0.15 + (117_450 - 45_500) * 0.25
                            + (190_200 - 117_450) * 0.28 + (372_950 - 190_200) * 0.33 + (taxableIncome - 372_950) * 0.35;
                }
            default:
                return 0.0;
        }

    }

    public static void main(String[] args) {
        for (int income = 50_000; income <= 70_000; income += 100) {
            long single = Math.round(computeTax(0, income));
            long marriedJoint = Math.round(computeTax(1, income));
            long marriedSeparate = Math.round(computeTax(2, income));
            long headOfHouse = Math.round(computeTax(3, income));

            System.out.printf("%5d  %5d  %4d  %5d  %4d\n", income,
                    single, marriedJoint, marriedSeparate, headOfHouse);
        }
    }
}

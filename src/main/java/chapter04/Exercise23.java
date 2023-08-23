package chapter04;

import java.util.Scanner;

public class Exercise23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        String employeeName = input.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        double hoursWorked = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double hourRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate:");
        double federalTaxRate = input.nextDouble();
        System.out.print("Enter state tax withholding rate:");
        double stateTaxRate = input.nextDouble();

        double grossPay = hourRate * hoursWorked;
        double federalWithholding = grossPay * federalTaxRate;
        double stateWithholding = grossPay * stateTaxRate;
        double totalDeduction = federalWithholding + stateWithholding;
        double netPay = grossPay - totalDeduction;

        System.out.println("Employee name: " + employeeName);
        System.out.println("Hours worked: " + hoursWorked);
        System.out.printf("Pay rate: $%5.2f\n", hourRate);
        System.out.printf("Gross pay: $%5.2f\n", grossPay);
        System.out.println("Deductions:");
        System.out.printf("   Federal Withholding (%2.1f): $%4.2f\n", federalTaxRate * 100, federalWithholding);
        System.out.printf("   State Withholding (%2.1f): $%4.2f\n", stateTaxRate * 100, stateWithholding);
        System.out.printf("Net pay: $%5.2f", netPay);

    }
}

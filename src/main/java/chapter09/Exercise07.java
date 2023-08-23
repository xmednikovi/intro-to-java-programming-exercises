package chapter09;

import java.util.Date;

public class Exercise07 {

    public static void main(String[] args) {
        Account account = new Account(1122, 20_000);
        Account.setAnnualInterestRate(4.5);
        account.withdraw(2500);
        account.deposit(3000);

        double balance = account.getBalance();
        double monthlyInterest = account.getMonthlyInterest();
        Date createdDate = account.getDateCreated();

        System.out.printf("The account balance is %5.2f\nThe monthly interest is %5.2f\nThe account was created on %s",
                balance, monthlyInterest, createdDate.toString());
    }
}

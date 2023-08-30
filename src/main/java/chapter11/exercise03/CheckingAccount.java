package chapter11.exercise03;

import chapter09.Account;

public class CheckingAccount extends Account {

    private double overdraftLimit;

    public CheckingAccount(int id, int initialBalance, double overdraftLimit) {
        super(id, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (this.getBalance() - amount < (-overdraftLimit)) {
            throw new OverdraftException();
        }
        super.withdraw(amount);
    }

    @Override
    public String toString() {
        return String.format("Checking account\nId:%d\nBalance:EUR %.2f", this.getId(), this.getBalance());
    }
}

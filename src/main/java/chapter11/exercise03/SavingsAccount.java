package chapter11.exercise03;

import chapter09.Account;

public class SavingsAccount extends Account {

    private final double MIN_BALANCE = 0;

    public SavingsAccount(int id, int initialBalance) {
        super(id, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (this.getBalance() - amount < MIN_BALANCE){
            throw new OverdraftException();
        }
        super.withdraw(amount);
    }

    @Override
    public String toString() {
        return String.format("Savings account\nId:%d\nBalance:EUR %.2f", this.getId(), this.getBalance());
    }
}

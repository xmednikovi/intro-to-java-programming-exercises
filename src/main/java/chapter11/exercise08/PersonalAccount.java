package chapter11.exercise08;

import chapter09.Account;

import java.util.ArrayList;
import java.util.Date;

public class PersonalAccount extends Account {

    private String name;
    private ArrayList<Transaction> transactions;

    public PersonalAccount(int id, int initialBalance, String name){
        super(id, initialBalance);
        this.name = name;
        this.transactions = new ArrayList<>();
    }

    @Override
    public void withdraw(double amount) {
        Transaction transaction = new Transaction('w', amount, this.getBalance(), "Withdraw");
        super.withdraw(amount);
        this.transactions.add(transaction);
    }

    @Override
    public void deposit(double amount) {
        Transaction transaction = new Transaction('d', amount, this.getBalance(), "Deposit");
        super.deposit(amount);
        this.transactions.add(transaction);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Personal account for " + this.getName() + "\n");
        sb.append("Id: " + this.getId() + "\n");
        sb.append("----------\n");
        sb.append("Transactions: \n");
        for (Transaction tr: transactions) {
            sb.append(tr.getDate() + " " + tr.getType() + " EUR" + tr.getAmount() + "\n");
        }

        sb.append("-----------\n");
        sb.append("Current balance: EUR" + this.getBalance());
        return sb.toString();
    }
}

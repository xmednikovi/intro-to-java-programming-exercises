package chapter09;

import java.util.Date;

class Account {

    private int id = 0;
    private double balance = 0;
    private static double annualInterestRate = 0;

    private Date dateCreated = new Date();

    Account(){}

    Account(int id, int initialBalance){
        this.id = id;
        this.balance = initialBalance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    double monthlyInterestRate(){
        return annualInterestRate / 1200;
    }

    double getMonthlyInterest(){
        double monthlyRate = this.monthlyInterestRate();
        return this.balance * monthlyRate;
    }

    void withdraw(double amount){
        this.balance = this.balance - amount;
    }

    void deposit (double amount){
        this.balance = this.balance + amount;
    }
}

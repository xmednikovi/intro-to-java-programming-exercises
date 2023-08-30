package chapter11.exercise03;

import chapter09.Account;

public class Exercise03 {

    public static void main(String[] args) {
        Account checkingAccount = new CheckingAccount(1, 100, 50);
        try{
            checkingAccount.withdraw(50);
            System.out.println(checkingAccount);
            checkingAccount.withdraw(120);
            System.out.println(checkingAccount);
        } catch (OverdraftException ex){
            System.out.println(ex.getMessage());
        }

        Account savingsAccount = new SavingsAccount(2, 500);
        try {
            savingsAccount.withdraw(600);
            System.out.println(savingsAccount);
        } catch (OverdraftException ex){
            System.out.println(ex.getMessage());
        }

        System.out.println(checkingAccount);
        System.out.println(savingsAccount);
    }
}

package chapter11;

import chapter09.Account;
import chapter11.exercise03.CheckingAccount;
import chapter11.exercise03.OverdraftException;
import chapter11.exercise03.SavingsAccount;
import org.junit.Test;

public class Exercise03Test {

    @Test(expected = OverdraftException.class)
    public void overdraftExceptionCheckingAccountTest(){
        Account checkingAccount = new CheckingAccount(1, 100, 50);
        checkingAccount.withdraw(160);
    }

    @Test(expected = OverdraftException.class)
    public void overdraftExceptionSavingAccountTest(){
        Account savingsAccount = new SavingsAccount(2, 500);
        savingsAccount.withdraw(600);
    }
}

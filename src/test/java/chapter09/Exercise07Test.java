package chapter09;

import org.junit.Assert;
import org.junit.Test;

public class Exercise07Test {

    @Test
    public void balanceTest(){
        Account account = new Account(1, 1000);
        account.withdraw(500);
        account.deposit(200);
        Assert.assertEquals(700, account.getBalance(), 0);
    }
}

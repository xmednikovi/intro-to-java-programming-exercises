package chapter12;

import org.junit.Test;

public class Exercise10Test {

    @Test(expected = NullDenominatorException.class)
    public void NullReminderIsNotAllowedTest() throws NullDenominatorException{
        Fraction fr = new Fraction(1, 0);
    }
}

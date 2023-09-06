package chapter06;

import org.junit.Assert;
import org.junit.Test;

public class Exercise21Test {

    @Test
    public void letterToDigitTest(){
        int result = Exercise21.letterToDigit("q");
        Assert.assertEquals(7, result);
    }

    @Test
    public void wordToDigitsTest(){
        String input = "Flowers";
        String result = Exercise21.wordToDigits(input);
        Assert.assertEquals("3569377", result);
    }
}

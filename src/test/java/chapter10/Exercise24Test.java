package chapter10;

import org.junit.Assert;
import org.junit.Test;

public class Exercise24Test {

    @Test
    public void isDigitTest(){
        MyCharacter myCharacter1 = new MyCharacter('4');
        Assert.assertTrue(myCharacter1.isDigit());

        MyCharacter myCharacter2 = new MyCharacter('a');
        Assert.assertFalse(myCharacter2.isDigit());
    }

    @Test
    public void isLetterTest(){
        MyCharacter myCharacter1 = new MyCharacter('a');
        Assert.assertTrue(myCharacter1.isLetter());

        MyCharacter myCharacter2 = new MyCharacter('5');
        Assert.assertFalse(myCharacter2.isLetter());
    }

    @Test
    public void isUpperCaseTest(){
        MyCharacter myCharacter1  = new MyCharacter('G');
        Assert.assertTrue(myCharacter1.isUppercase());

        MyCharacter myCharacter2 = new MyCharacter('g');
        Assert.assertFalse(myCharacter2.isUppercase());
    }

    @Test
    public void isLowercaseTest(){
        MyCharacter myCharacter1  = new MyCharacter('y');
        Assert.assertTrue(myCharacter1.isLowercase());

        MyCharacter myCharacter2 = new MyCharacter('Y');
        Assert.assertFalse(myCharacter2.isLowercase());
    }
}

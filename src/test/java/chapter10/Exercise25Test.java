package chapter10;

import org.junit.Assert;
import org.junit.Test;

public class Exercise25Test {

    @Test
    public void splitTest(){
        String str = "Hello@World@This@Is@A@Java@Program";
        String[] arr = Exercise25.split(str, "@");
        Assert.assertEquals(13, arr.length);
    }
}

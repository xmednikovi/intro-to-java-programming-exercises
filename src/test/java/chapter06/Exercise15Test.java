package chapter06;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static chapter06.Exercise15.*;

public class Exercise15Test {

    @Test
    public void computeTaxSingleTest(){
        // For taxable income 50000 taxes are 8688
        Assert.assertEquals(8688, Math.round(computeTax(0, 50000)));
        // For taxable income 50100 taxes are 8713
        Assert.assertEquals(8713, Math.round(computeTax(0, 50100)));
        // For taxable income 69900 taxes are 13663
        Assert.assertEquals(13663, Math.round(computeTax(0, 69900)));
        // For taxable income 70000 taxes are 13688
        Assert.assertEquals(13688, Math.round(computeTax(0, 70000)));
    }

    @Test
    public void computeTaxMarriedJointTest(){
        // For taxable income 50000 taxes are 6665
        Assert.assertEquals(6665, Math.round(computeTax(1, 50000)));
        // For taxable income 50100 taxes are 6680
        Assert.assertEquals(6680, Math.round(computeTax(1, 50100)));
        // For taxable income 69900 taxes are 9850
        Assert.assertEquals(9850, Math.round(computeTax(1, 69900)));
        // For taxable income 70000 taxes are 9875
        Assert.assertEquals(9875, Math.round(computeTax(1, 70000)));
    }

    @Test
    @Ignore
    public void computeTaxMarriedSeparateTest(){
        // For taxable income 50000 taxes are 8688
        Assert.assertEquals(8688, Math.round(computeTax(2, 50000)));
        // For taxable income 50100 taxes are 8713
        Assert.assertEquals(8713, Math.round(computeTax(2, 50100)));
        // For taxable income 69900 taxes are 12328
        Assert.assertEquals(12328, Math.round(computeTax(2, 69900)));
        // For taxable income 70000 taxes are 12353
        Assert.assertEquals(12353, Math.round(computeTax(2, 70000)));
    }

    @Test
    @Ignore
    public void computeTaxMarriedHeadOfHouseTest(){
        // For taxable income 50000 taxes are 7353
        Assert.assertEquals(7353, Math.round(computeTax(3, 50000)));
        // For taxable income 50100 taxes are 7378
        Assert.assertEquals(7378, Math.round(computeTax(3, 50100)));
        // For taxable income 69900 taxes are 9840
        Assert.assertEquals(9840, Math.round(computeTax(3, 69900)));
        // For taxable income 70000 taxes are 9853
        Assert.assertEquals(9853, Math.round(computeTax(3, 70000)));
    }
}

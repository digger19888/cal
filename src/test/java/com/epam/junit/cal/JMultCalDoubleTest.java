package com.epam.junit.cal;

import org.junit.Assert;
import org.junit.Test;

public class JMultCalDoubleTest extends JBaseTest {

    @Test
    public void twoPointOneMultipleThreePointTwoTest() {
        double result = calculator.mult(2.1, 3.2);
        Assert.assertEquals(6.2, result, 0);
    }
}

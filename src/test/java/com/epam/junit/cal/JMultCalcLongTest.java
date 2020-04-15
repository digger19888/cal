package com.epam.junit.cal;

import org.junit.Assert;
import org.junit.Test;

public class JMultCalcLongTest extends JBaseTest {

    @Test
    public void twoMultipleThreeTest() {
        long result = calculator.mult(2, 3);
        Assert.assertEquals(6, result, 0);
    }
}

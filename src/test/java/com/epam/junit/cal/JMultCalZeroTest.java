package com.epam.junit.cal;

import org.junit.Assert;
import org.junit.Test;

public class JMultCalZeroTest extends JBaseTest {

    @Test
    public void twoMultipleZero() {
        long result = calculator.mult(2, 0);
        Assert.assertEquals(0, result, 0);
    }
}

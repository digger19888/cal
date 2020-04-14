package com.epam.junit.cal;

import org.junit.Assert;
import org.junit.Test;

public class JDivCalLongTest extends JBaseTest {

    @Test
    public void sixDivisionThreeTest () {
        long result = calculator.div(6,3);
        Assert.assertEquals(2, result,0);
    }
}

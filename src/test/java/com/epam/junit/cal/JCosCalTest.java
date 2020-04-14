package com.epam.junit.cal;

import org.junit.Assert;
import org.junit.Test;

public class JCosCalTest extends JBaseTest {
    @Test
    public void cosThree () {
        double result = calculator.cos(3);
        Assert.assertEquals(0.998629, result,0);
    }
}

package com.epam.testng.cal;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DivCalLongTest extends BaseTest {
    @Test(groups = {"divCal"})
    public void sixDivisionThreeTest() {
        long result = calculator.div(6, 3);
        Assert.assertTrue(result == 2);
    }
}

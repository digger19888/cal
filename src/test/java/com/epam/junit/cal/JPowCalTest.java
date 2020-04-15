package com.epam.testng.cal;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JPowCalTest extends BaseTest {
    @Test
    public void threePowTwo() {
        double result = calculator.pow(3, 2);
        Assert.assertEquals(result, 9, "Invalid result!");
    }
}

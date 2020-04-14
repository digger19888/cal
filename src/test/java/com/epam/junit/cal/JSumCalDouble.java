package com.epam.testng.cal;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JSumCalDouble extends BaseTest{
    @Test
    public void onePointTwoPlusTwoPointOneTest() {
        double result = calculator.sum(1.2, 2.1);
        Assert.assertEquals(result, 3.3, "Invalid result!");
    }
}
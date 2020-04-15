package com.epam.testng.cal;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PowCalTest extends BaseTest {
    @Test(dataProvider = "valuesForPowTest")
    public void threePowTwo(double a, double b, double expectedValue) {
        double result = calculator.pow(a, b);
        Assert.assertEquals(result, expectedValue, "Invalid result!");
    }

    @DataProvider(name = "valuesForPowTest")
    public Object[][] valuesForPow() {
        return new Object[][]{
                {2, 3, 8},
                {10.5, -1, 0.09523809523809523},
                {0, 2, 0},
                {-10, 0, 1},
                {2, 0, 1},
                {-2, 2, 4},
                {3, 1.5, 5.19615242270663188}
        };
    }
}

package com.epam.testng.cal;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultCalLongTest extends BaseTest {
    @Test(dataProvider = "valuesForMultipleTest")
    public void twoMultipleThreeTest(double a, double b, double expectedValue) {
        double result = calculator.mult(a, b);
        Assert.assertEquals(result, expectedValue, "Invalid value!");
    }

    @DataProvider(name = "valuesForMultipleTest")
    public Object[][] valuesForMultiple() {
        return new Object[][]{
                {23, 10, 230},
                {10, -1, -10},
                {0, -2, 0},
                {-10, -20, 200},
                {0, 0, 0}
        };
    }
}

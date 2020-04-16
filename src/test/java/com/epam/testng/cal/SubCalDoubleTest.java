package com.epam.testng.cal;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubCalDoubleTest extends BaseTest {
    @Test(dataProvider = "valuesForSubDoubleTest")
    public void positiveSubTest(double a, double b, double expectedValue) {
        double result = calculator.sub(a, b);
        Assert.assertEquals(result, expectedValue, "Invalid result!");
    }

    @DataProvider(name = "valuesForSubDoubleTest")
    public Object[][] valuesForSub() {
        return new Object[][]{
                {23.2, 10.1, 13.1},
                {10.5, -1.0, 11.5},
                {0, -2.2, 2.2},
                {-10.3, -20.5, 10.2},
                {10.4, 20.2, -9.799999999999999}
        };
    }
}

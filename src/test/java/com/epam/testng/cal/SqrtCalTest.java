package com.epam.testng.cal;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SqrtCalTest extends BaseTest {
    @Test(dataProvider = "valuesForSqrtTest")
    public void sqrtTwentyFive(double a, double expectedValue) {
        double result = calculator.sqrt(a);
        Assert.assertEquals(result, expectedValue, "Invalid value!");
    }

    @DataProvider(name = "valuesForSqrtTest")
    public Object[][] valuesForSqrt() {
        return new Object[][]{
                {25, 5},
                {0, 0},
                {4.4, 2.0976176963403033},
                {-4, "Invalid value"}
        };
    }
}

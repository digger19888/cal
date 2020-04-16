package com.epam.testng.cal;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SqrtCalTest extends BaseTest {
    @Test(dataProvider = "valuesForSqrtTest")
    public void sqrtTest(double a, double expectedValue) {
        double result = calculator.sqrt(a);
        Assert.assertEquals(result, expectedValue, "Invalid value!");
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void sqrtMinusOne() {
        double a = -1;
        if (a < 0L) {
            throw new ArithmeticException("Attempt to divide by zero");
        }
        double result = calculator.sqrt(a);
    }

    @DataProvider(name = "valuesForSqrtTest")
    public Object[][] valuesForSqrt() {
        return new Object[][]{
                {25, 5},
                {0, 0},
                {4.4, 2.0976176963403033}
        };
    }
}

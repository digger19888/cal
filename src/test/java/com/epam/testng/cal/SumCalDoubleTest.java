package com.epam.testng.cal;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumCalDoubleTest extends BaseTest {
    @Test(dataProvider = "valuesForSumDoubleTest")
    public void onePlusTwoTest(double a, double b, double expectedValue) {
        double result = calculator.sum(a, b);
        Assert.assertEquals(result, expectedValue, "Invalid result!");
    }

    @DataProvider(name = "valuesForSumDoubleTest")
    public Object[][] valuesForSum() {
        return new Object[][]{
                {10.1, 23.2, 33.3},
                {10.2, -1.1, 9.1},
                {0, 3.3, 3.3},
                {-10.2, -20.3, -30.5}
        };
    }
}

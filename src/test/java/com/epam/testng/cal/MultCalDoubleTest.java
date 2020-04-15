package com.epam.testng.cal;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultCalDoubleTest extends BaseTest {
    @Test(dataProvider = "valuesForMultipleDoubleTest")
    public void twoPointOneMultipleThreePointTwoTest(double a, double b, double expectedValue) {
        double result = calculator.mult(a, b);
        Assert.assertEquals(result, expectedValue, "Invalid value!");
    }

    @DataProvider(name = "valuesForMultipleDoubleTest")
    public Object[][] valuesForMultiple() {
        return new Object[][]{
                {23.2, 10.1, 234},
                {10.5, -1.0, -11},
                {0, -2.2, 0},
                {-10.3, -20.5, 211},
                {0, 0, 0}
        };
    }
}

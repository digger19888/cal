package com.epam.testng.cal;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumCalLongTest extends BaseTest {

    @Test(dataProvider = "valuesForSumTest")
    public void onePlusTwoTest(long a, long b, long expectedValue) {
        long result = calculator.sum(a, b);
        Assert.assertEquals(result, expectedValue, "Invalid result!");
    }

    @DataProvider(name = "valuesForSumTest")
    public Object[][] valuesForSum() {
        return new Object[][]{
                {10, 23, 33},
                {10, -1, 9},
                {0, 0, 0},
                {-10, -20, -30}
        };
    }
}

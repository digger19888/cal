package com.epam.testng.cal;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubCalLongTest extends BaseTest {
    @Test(dataProvider = "valuesForSubTest")
    public void positiveSubTest(long a, long b, long expectedValue) {
        long result = calculator.sub(a, b);
        Assert.assertEquals(result, expectedValue, "Invalid result!");
    }

    @DataProvider(name = "valuesForSubTest")
    public Object[][] valuesForSub() {
        return new Object[][]{
                {23, 10, 13},
                {10, -1, 11},
                {0, -2, 2},
                {-10, -20, 10},
                {10, 20, -10}
        };
    }
}

package com.epam.testng.cal;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JSumCalLong extends BaseTest {
    @Test
    public void onePlusTwoTest() {
        long result = calculator.sum(1, 2);
        Assert.assertEquals(result, 3, "Invalid result!");
    }
}
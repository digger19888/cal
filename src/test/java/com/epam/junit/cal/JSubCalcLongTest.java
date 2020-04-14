package com.epam.testng.cal;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JSubCalcLongTest extends BaseTest{
    @Test
    public void twoMinusOneTest() {
        long result = calculator.sub(2, 1);
        Assert.assertEquals(result, 1, "Invalid result!");
    }
}
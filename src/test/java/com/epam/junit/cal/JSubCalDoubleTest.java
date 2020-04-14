package com.epam.testng.cal;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JSubCalDoubleTest extends BaseTest{
    @Test
    public void twoPointTwoMinusOnePointOneTest() {
        double result = calculator.sub(2.2, 1.1);
        Assert.assertEquals(result, 1.1, "Invalid result!");
    }
}
package com.epam.testng.cal;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JSqrtCalTest extends BaseTest{
    @Test
    public void sqrtTwentyFive () {
        double result = calculator.sqrt(25);
        Assert.assertEquals(result, 5, "Invalid result!");
    }
}

package com.epam.testng.cal;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JSinCalTest extends BaseTest{
    @Test
    public void sinThree () {
        double result = calculator.sin(3);
        Assert.assertEquals(result, 0.052335, "Invalid result!");
    }
}

package com.epam.testng.cal;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SinCalTest extends BaseTest {
    private double Pi = 3.14;

    @Test
    public void sinThree() {
        double result = calculator.sin(3);
        Assert.assertEquals(result, 0.052335, "Invalid result!");
    }

    @Test
    public void sinZero() {
        double result = calculator.sin(0);
        Assert.assertEquals(result, 0, "Invalid result!");
    }

    @Test
    public void sinMinusOne() {
        double result = calculator.sin(-1);
        Assert.assertEquals(result, -0.017452, "Invalid result!");
    }

    @Test
    public void sinPi() {
        double result = calculator.sin(Pi);
        Assert.assertEquals(result, 0.054803, "Invalid result!");
    }
}

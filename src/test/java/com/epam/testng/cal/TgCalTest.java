package com.epam.testng.cal;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TgCalTest extends BaseTest {
    private double Pi = 3.14;

    @Test
    public void tgthree() {
        double result = calculator.tg(3);
        Assert.assertEquals(result, 0.052407, "Invalid result!");
    }

    @Test
    public void tgMinusOne() {
        double result = calculator.tg(-1);
        Assert.assertEquals(result, -0.017455, "Invalid result!");
    }

    @Test
    public void tgZero() {
        double result = calculator.tg(0);
        Assert.assertEquals(result, 0, "Invalid result!");
    }

    @Test
    public void tgPi() {
        double result = calculator.tg(Pi);
        Assert.assertEquals(result, 0.054886, "Invalid result!");
    }
}

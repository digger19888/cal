package com.epam.testng.cal;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CosCalTest extends BaseTest {
    private double Pi = 3.14;

    @Test
    public void cosThree() {
        double result = calculator.cos(3);
        Assert.assertEquals(result, 0.998629, "Invalid result!");
    }

    @Test
    public void cosZero() {
        double result = calculator.cos(0);
        Assert.assertEquals(result, 1, "Invalid value!");
    }

    @Test
    public void cosMinusOne() {
        double result = calculator.cos(-1);
        Assert.assertEquals(result, 0.999847, "Invalid result!");
    }

    @Test
    public void cosPi() {
        double result = calculator.cos(Pi);
        Assert.assertEquals(result, 0.998497, "Invalid result!");
    }
}

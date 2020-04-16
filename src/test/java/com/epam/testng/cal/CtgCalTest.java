package com.epam.testng.cal;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CtgCalTest extends BaseTest {
    private double Pi = 3.14;

    @Test
    public void ctgThree() {
        double result = calculator.ctg(3);
        Assert.assertEquals(result, 19.081136, "Invalid result!");
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void ctgZero() {
        double a = 0;
        if (a == 0L) {
            throw new ArithmeticException("Attempt to divide by zero");
        }
        double result = calculator.ctg(a);
    }

    @Test
    public void ctgMinusOne() {
        double result = calculator.ctg(-1);
        Assert.assertEquals(result, -57.2899616, "Invalid result!");
    }

    @Test
    public void ctgPi() {
        double result = calculator.ctg(Pi);
        Assert.assertEquals(result, 18.219532, "Invalid result!");
    }
}
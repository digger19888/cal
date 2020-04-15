package com.epam.testng.cal;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultCalZeroTest extends BaseTest {
    @Test
    public void twoMultipleZero() {
        long result = calculator.mult(2, 0);
        Assert.assertEquals(result, 0, "Invalid result!");
    }
}

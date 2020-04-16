package com.epam.testng.cal;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametrCalTest extends BaseTest {
    //@Parameters({"first", "second", "expected"})
    @Test
    public void parTest(long first, long second, long expected) {
        long sum = calculator.sum(first, second);
        Assert.assertEquals(sum, expected);
    }
}

package com.epam.testng.cal;

import org.testng.annotations.Test;

public class DivCalZeroTest extends BaseTest {
    @Test(expectedExceptions = ArithmeticException.class)
    public void threeDivisionZero() {
        long a = 3, b = 0;

        if (b == 0L) {
            throw new ArithmeticException("Attempt to divide by zero");
        }
        long result = calculator.div(a, b);
    }

}
package com.epam.junit.cal;

import org.junit.Test;

public class JDivCalZeroTest extends JBaseTest {
    @Test
    public void threeDivisionZero() {
        long a = 3, b = 0;
        long result = calculator.div(a, b);
        if (b == 0L) {
            throw new NumberFormatException("Attempt to divide by zero");
        }
    }
}
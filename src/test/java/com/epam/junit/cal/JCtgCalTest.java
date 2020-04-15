package com.epam.junit.cal;

import org.junit.Assert;
import org.junit.Test;

public class JCtgCalTest extends JBaseTest {
    @Test
    public void cosThree() {
        double result = calculator.ctg(3);
        Assert.assertEquals(19.081136, result, 0);
    }
}

package com.epam.junit.cal;

import org.junit.Assert;
import org.junit.Test;

public class JDivCalDoubleTest extends JBaseTest {

    @Test
    public void sixPointSixDivisionThreePointThree () {
            double result = calculator.div(6.6,3.3);
        Assert.assertEquals(2, result,0);
    }
}


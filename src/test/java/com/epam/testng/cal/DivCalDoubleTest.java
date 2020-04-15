package com.epam.testng.cal;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DivCalDoubleTest extends BaseTest {
    @Test(groups = {"divCal"})
    public void sixPointSixDivisionThreePointThree() {
        double result = calculator.div(6.6, 3.3);
        Assert.assertEquals(result, 2, "Invalid result!");
    }
}

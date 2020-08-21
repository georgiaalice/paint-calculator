package paintcalculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculationsTest {

    @Test
    public void calculateAreaOfFloorCorrectly() {

        Calculations calculations = new Calculations();

        Assert.assertEquals(50, calculations.calculateAreaOfFloor(5, 10));

    }
}
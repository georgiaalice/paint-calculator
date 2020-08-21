package paintcalculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculationsTest {

    @Test
    public void calculateAreaOfFloorCorrectly() {

        Calculations calculations = new Calculations();

        Assert.assertEquals(50, calculations.calculateAreaOfFloor(5, 10));

    }

    @Test
    public void calculateAmountOfPaintRequired() {

        Calculations calculations = new Calculations();

        Assert.assertEquals(4, calculations.calculateAmountOfPaintRequired(5, 10, 2));

    }

}
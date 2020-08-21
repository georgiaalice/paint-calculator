package paintcalculator;

import static org.junit.Assert.assertEquals;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

public class UserInteractionTest {

    @Rule
    public final TextFromStandardInputStream systemInMock = emptyStandardInputStream();

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void shouldOutputCorrectly() {

        systemInMock.provideLines("1", "2", "3");
        UserInteraction.calculateOutputs();

        String expectedOutput = "Enter the width of the room in metres:" + "\n"
                + "Enter the length of the room in metres:" + "\n" + "Enter the height of the room in metres:" + "\n"
                + "Area of the floor: 2 metres squared" + "\n" + "Amount of paint required to paint the walls: 1 litres"
                + "\n" + "Volume of the room: 6 metres cubed" + "\n";
        assertEquals(expectedOutput, systemOutRule.getLog());
    }

}
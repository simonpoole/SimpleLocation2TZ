package ch.poole.misc.simplelocation2tz;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;

public class SimpleLocation2TzTest {

    SimpleLocation2Tz simpleLocation2Tz;

    @Before
    public void setup() {
        try {
            simpleLocation2Tz = new SimpleLocation2Tz();
        } catch (IOException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void getTimeZoneTest() {
        assertEquals("Europe/Paris", simpleLocation2Tz.getTimeZone(8.3768902, 47.3951317));
    }
}

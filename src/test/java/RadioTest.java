import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    private Radio radio;

    @Before
    public void setUp(){
        radio = new Radio("Sony", "Alpha1", "");
    }

    @Test
    public void canTuneRadio(){
        radio.setStation("6 Music");
        assertEquals("6 Music", radio.getStation());
    }
}

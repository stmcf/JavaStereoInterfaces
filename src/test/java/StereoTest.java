import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    Stereo stereo;
    Radio radio;
    CDPlayer cdPlayer;

    @Before
    public void before(){
        radio = new Radio("Yamaha", "Super-10", "");
        cdPlayer = new CDPlayer("Sony", "Shiny-10", 5);
        stereo =  new Stereo("SuperStereo", radio, cdPlayer);
    }

    @Test
        public void canChangeVolume(){
        stereo.changeVolume(5);
        assertEquals(5, stereo.getVolume());
        stereo.changeVolume(-4);
        assertEquals(1, stereo.getVolume());
    }

    @Test
    public void volumeCannotGoBelowZero(){
        stereo.changeVolume(-100);
        assertEquals(0, stereo.getVolume());
    }

    @Test
    public void canConnectToStereo(){
        Device device = new Device("MP3 Player");
        assertEquals("Connected to MP3 Player", stereo.connect(device));
    }
}

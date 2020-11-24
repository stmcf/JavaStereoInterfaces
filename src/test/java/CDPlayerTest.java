import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    private CDPlayer shinyCDPlayer;

    @Before
    public void before() {
        shinyCDPlayer = new CDPlayer("Shiny", "Silver", 5);
    }

    @Test
    public void cdPlayerCanHoldCDs(){
        shinyCDPlayer.addCD(1);
        assertEquals(1, shinyCDPlayer.getNumberOfCDs());
    }

}

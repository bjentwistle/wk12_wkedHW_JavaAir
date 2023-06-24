import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PilotTest {
    Pilot pilot;

    @Before
    public void setUp(){
        pilot = new Pilot("Jane Brodie",1, CrewRank.CAPTAIN, "CPL002341" );
    }
    @Test
    public void hasLicence(){
        assertEquals("CPL002341", pilot.getLicence());
    }
    //won't test all the other attributes as they are tested in CrewMember parent.
    @Test
    public void canFlyPlane(){
        assertEquals("Valid Licence", pilot.canFly());
    }
}

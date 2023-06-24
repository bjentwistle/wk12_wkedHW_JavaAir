import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class CabinCrewTest {

    CabinCrew cabinCrew;

    @Before
    public void setUp(){
        cabinCrew = new CabinCrew("Graham Smith", 1, CrewRank.FLIGHT_ATTENDANT);
    }
    @Test
    public void canRelayMsg(){
        assertEquals("Please stay seated with your seatbelts fastened", cabinCrew.relayMsg());
    }


}

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class PassengerTest {
    Passenger passenger;
    @Before
    public void before(){
        passenger = new Passenger("Mel Smith", 2);
    }
    @Test
    public void checkPassengerName(){
        assertEquals("Mel Smith", passenger.getName());
    }
}

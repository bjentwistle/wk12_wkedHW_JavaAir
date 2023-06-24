import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private final ArrayList<Passenger> passengers = new ArrayList<>();

    @Before
    public void setUp(){
        Passenger passenger1 = new Passenger("Ted Boyd", 2);
        Passenger passenger2 = new Passenger("Sandra Boyd", 2);
        Passenger passenger3 = new Passenger("Junior Boyd", 1);
        Passenger passenger4 = new Passenger("Lisa Boyd", 2);
        Passenger passenger5 = new Passenger("Teddy Boyd", 1);
        passengers.add(passenger1);
        passengers.add(passenger2);
        passengers.add(passenger3);
        passengers.add(passenger4);
        passengers.add(passenger5);
        flight = new Flight("BA1234", "LGW","EDI","1400", passengers);

    }
    @Test
    public void hasFlightNum(){
        assertEquals("BA1234", flight.getFlightNum());
    }
    @Test
    public void hasDepartureCode(){
        assertEquals("LGW", flight.getDepartureCode());
    }
    @Test
    public void hasDestinationCode(){
        assertEquals("EDI", flight.getDestinationCode());
    } @Test
    public void hasDepartureTime(){
        assertEquals("1400", flight.getDepartureTime());
    }

    @Test
    public void hasCollectionOfPassengers(){
        assertEquals(5, flight.passengerCount(passengers));
    }
}

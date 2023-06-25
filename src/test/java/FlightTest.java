import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private final ArrayList<Passenger> passengers = new ArrayList<>();
    private final ArrayList<CabinCrew> cabinCrewMembers = new ArrayList<>();
    private final ArrayList<Pilot> pilots = new ArrayList<>();

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
        Pilot pilot = new Pilot("Jane Brodie",1, CrewRank.CAPTAIN, "CPL002341");
        pilots.add(pilot);
        CabinCrew cabinCrew1 = new CabinCrew("Graham Smith", 1, CrewRank.FLIGHT_ATTENDANT);
        CabinCrew cabinCrew2 = new CabinCrew("Sandra Ho", 1, CrewRank.LEAD_ATTENDANT);
        cabinCrewMembers.add(cabinCrew1);
        cabinCrewMembers.add(cabinCrew2);
        flight = new Flight("BA1234", "LGW","EDI","1400", passengers, pilots, cabinCrewMembers, 6);

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
    @Test
    public void hasBaggageTotal(){
        assertEquals(8, flight.getBaggageTotal(passengers));
    }
    @Test
    public void hasPassengerNameTed(){
        assertEquals(true, flight.getPassengerByName(passengers, "Lisa Boyd"));
    }
    @Test
    public void canAddPassenger(){
        Passenger passenger6 = new Passenger("Amy Pond", 2);
        flight.addPassenger(passengers, passenger6);
        assertEquals(6, flight.passengerCount(passengers));
    }
    @Test
    public void hasCabinCrew(){
        assertEquals(2, flight.getCabinCrewSize());
    }   @Test
    public void hasPilot(){
        assertEquals(1, flight.getPilotPresent());
    }
    @Test
    public void hasCapacity(){
        assertEquals(6, flight.getCapacity());
    }
}

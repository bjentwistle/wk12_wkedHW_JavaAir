import java.util.ArrayList;
import java.util.Objects;

public class Flight {

//    at least one Pilot
//    some CabinCrewMembers
//    a collection of Passenger's
//    flight number (i.e. "FR756")
//    destination (i.e. GLA, EDI)
//    departure airport (i.e. GLA, EDI)
//    departure time (use a String)
//    a total weight allowance for all baggage / passengers / cargo

    private final String flightNum;

    private String departureCode;
    private String destinationCode;
    private String departureTime;
    private ArrayList<Passenger> passengers;
    private  ArrayList<Pilot> pilots;
    private ArrayList<CabinCrew> cabinCrewMembers;

    private int capacity;


    //private int totalWeightOfFlight;
    //Need several Hashmaps of (bags:int, passengers:int)
    // ie need to know how many of each - bags, passengers. Then multiply by some average weight.
    //Also need cargo weight.

    public Flight(String flightNum, String departureCode, String destinationCode, String departureTime, ArrayList<Passenger> passengers, ArrayList<Pilot> pilots, ArrayList<CabinCrew> cabinCrewMembers, int capacity){
        this.flightNum = flightNum;
        this.departureCode = departureCode;
        this.destinationCode = destinationCode;
        this.departureTime = departureTime;
        this.passengers = passengers;
        this.pilots = pilots;
        this.cabinCrewMembers = cabinCrewMembers;
        this.capacity = capacity;

    }
    public String getFlightNum() {
        return this.flightNum;
    }
    public String getDepartureCode() {
        return this.departureCode;
    }
    public String getDestinationCode() {
        return this.destinationCode;
    }
    public String getDepartureTime() {
        return this.departureTime;
    }
    public int passengerCount(ArrayList<Passenger> inputArray) {
        return inputArray.size();
    }
    public int getBaggageTotal(ArrayList<Passenger> passengers) {
        int totalBags = 0;
        for (int i = 0 ; i < passengers.size(); i++){
            totalBags += passengers.get(i).getBags();
        }
        return totalBags;
    }
    public Boolean getPassengerByName(ArrayList<Passenger> passengers, String passengerName) {
        for (int i = 0 ; i < passengers.size(); i++){
            if (Objects.equals(passengers.get(i).getName(), passengerName)){
                return true;
            }
        }
        return false;
    }
    public int addPassenger(ArrayList<Passenger> passengers, Passenger passenger6) {
        if (capacity > passengers.size()) {
            passengers.add(passenger6);
        }
        return passengerCount(passengers);
    }


    public int getCabinCrewSize() {
        return cabinCrewMembers.size();
    }

    public int getPilotPresent() {
        return pilots.size();
    }

    public int getCapacity() {
        return capacity;
    }
}

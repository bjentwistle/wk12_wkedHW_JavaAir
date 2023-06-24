public class CabinCrew extends CrewMember{

    public CabinCrew(String initialName, int bags, CrewRank crewRank){
        super(initialName, bags, crewRank);
    }

    public String relayMsg() {
        return "Please stay seated with your seatbelts fastened";
    }
}

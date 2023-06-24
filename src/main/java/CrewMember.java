public class  CrewMember extends Passenger{
    CrewRank crewRank; //gets ranks from enums CrewRank.

    public CrewMember(String initialName, int bags, CrewRank crewRank) {
        super(initialName, bags); // gets these values from super
        this.crewRank = crewRank;
    }
}

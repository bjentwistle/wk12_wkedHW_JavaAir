public class Pilot extends CrewMember{

    private String licence;

    public Pilot(String initialName, int bags, CrewRank crewRank, String licence) {
        super(initialName, bags, crewRank);
        this.licence = licence;
    }
    public String getLicence() {
        return licence;
    }
    public String canFly() {
        return "Valid Licence";
    }
}

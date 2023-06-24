import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CrewMemberTest {

    CrewMember crewMember;


    @Before
    public void before(){
        crewMember = new CrewMember("Jane Brodie", 1 , CrewRank.CAPTAIN);
    }

    @Test
    public void hasRank(){
        assertEquals(CrewRank.CAPTAIN, crewMember.crewRank);
    }

    @Test
    public void hasName(){ //uses getName function from parent Passenger
        assertEquals("Jane Brodie", crewMember.getName());
    }
    @Test
    public void hasBags(){
        assertEquals(1, crewMember.getBags());
    }

}

import creatures.Dragon;
import enemies.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DragonTest {

    private Dragon dragon1;
    private Troll troll1;

    @Before
    public void before(){
        dragon1 = new Dragon("Smaug", 2);
        troll1 = new Troll("Rick", 15);
    }

    @Test
    public void canDamageRick(){
        dragon1.defend(troll1);
        assertEquals(13, troll1.getHealthPoints());
    }

}

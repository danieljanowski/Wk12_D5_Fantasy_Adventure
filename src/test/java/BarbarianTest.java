import enemies.Troll;
import org.junit.Before;
import org.junit.Test;
import players.Barbarian;
import weapons.Axe;
import weapons.Club;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    private Barbarian barbarian1;
    private Club club1;
    private Troll troll1;

    @Before
    public void before(){
        club1 = new Club(3);
        barbarian1 = new Barbarian("Conan", 20, club1);
        troll1 = new Troll("Rick", 15);
    }

    @Test
    public void canDamageTroll(){
        barbarian1.attack(troll1);

        assertEquals(12, troll1.getHealthPoints());
    }

}

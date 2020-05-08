import enemies.Troll;
import org.junit.Before;
import org.junit.Test;
import players.Barbarian;
import players.Knight;
import weapons.Axe;
import weapons.Club;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    private Knight knight1;
    private Sword sword1;
    private Troll troll1;

    @Before
    public void before(){
        sword1 = new Sword(3);
        knight1 = new Knight("Lysander", 20, sword1);
        troll1 = new Troll("Rick", 15);
    }

    @Test
    public void canDamageTroll(){
        knight1.attack(troll1);

        assertEquals(12, troll1.getHealthPoints());
    }

}
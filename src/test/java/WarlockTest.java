import behaviours.ISpell;
import creatures.Dragon;
import enemies.Orc;
import org.junit.Before;
import org.junit.Test;
import players.Warlock;
import spells.FireBall;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    private Warlock warlock;
    private FireBall fireball;
    private Dragon dragon;
    private Orc orc;

    @Before
    public void before(){
        fireball = new FireBall(5);
        dragon = new Dragon("Toothless", 7);
        warlock = new Warlock("Wally", 20, fireball, dragon);
        orc = new Orc("Gosmog", 21);
    }

    @Test
    public void warlockCanAttack(){
        warlock.cast(orc);
        assertEquals(9, orc.getHealthPoints());
    }
}

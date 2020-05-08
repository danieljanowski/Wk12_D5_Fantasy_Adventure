import enemies.Orc;
import enemies.Troll;
import org.junit.Before;
import org.junit.Test;
import players.Barbarian;
import players.Dwarf;
import weapons.Axe;
import weapons.Club;


import static org.junit.Assert.assertEquals;

public class DwarfTest {

    private Dwarf dwarf1;
    private Axe axe1;
    private Orc orc1;

    @Before
    public void before(){
        axe1 = new Axe(3);
        dwarf1 = new Dwarf("Gimli", 20, axe1);
        orc1 = new Orc("Ranagog", 15);
    }

    @Test
    public void canDamageOrc(){
        dwarf1.attack(orc1);

        assertEquals(12, orc1.getHealthPoints());
    }

}
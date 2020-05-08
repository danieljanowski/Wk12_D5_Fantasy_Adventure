package players;

import behaviours.IDefend;
import behaviours.ISpell;

public class Warlock extends Mage {


    public Warlock(String name, int healthPoints, ISpell spell, IDefend creature) {
        super(name, healthPoints, spell, creature);
    }
}

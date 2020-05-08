package players;

import behaviours.IDefend;
import behaviours.ISpell;
import enemies.Enemy;

import java.util.IdentityHashMap;

public abstract class Mage extends Player {

    private ISpell spell;
    private IDefend creature;

    public Mage(String name, int healthPoints, ISpell spell, IDefend creature) {
        super(name, healthPoints);
        this.spell = spell;
        this.creature = creature;
    }

    public ISpell getSpell() {
        return spell;
    }

    public IDefend getCreature() {
        return creature;
    }

    public void cast(Enemy enemy){
        this.spell.cast(enemy);
        this.creature.defend(enemy);
    }
}

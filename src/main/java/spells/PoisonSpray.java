package spells;

import behaviours.ISpell;
import enemies.Enemy;

public class PoisonSpray implements ISpell {

    private int powerValue;

    public PoisonSpray(int powerValue) {
        this.powerValue = powerValue;
    }

    public void cast(Enemy enemy) {
        enemy.takeDamage(powerValue);
    }
}

package spells;

import behaviours.ISpell;
import enemies.Enemy;

public class FireBall implements ISpell {

    private int powerValue;

    public FireBall(int powerValue) {
        this.powerValue = powerValue;
    }

    public int getPowerValue() {
        return powerValue;
    }

    public void cast(Enemy enemy) {
        enemy.takeDamage(powerValue);
    }
}

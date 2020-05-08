package weapons;

import behaviours.IWeapon;
import enemies.Enemy;

public class Club implements IWeapon {
    int damageValue;

    public Club(int damageValue) {
        this.damageValue = damageValue;
    }

    public int getDamageValue() {
        return damageValue;
    }

    public void attack(Enemy enemy) {
        enemy.takeDamage(this.damageValue);
    }
}

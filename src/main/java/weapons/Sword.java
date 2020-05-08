package weapons;

import behaviours.IWeapon;
import enemies.Enemy;

public class Sword implements IWeapon {
    int damageValue;

    public Sword(int damageValue) {
        this.damageValue = damageValue;
    }

    public int getDamageValue() {
        return damageValue;
    }

    public void attack(Enemy enemy) {
        enemy.takeDamage(this.damageValue);
    }
}

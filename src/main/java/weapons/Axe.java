package weapons;

import behaviours.IWeapon;
import enemies.Enemy;

public class Axe implements IWeapon {
    int damageValue;

    public Axe(int damageValue) {
        this.damageValue = damageValue;
    }

    public int getDamageValue() {
        return damageValue;
    }

    public void attack(Enemy enemy) {
        enemy.takeDamage(this.damageValue);
    }}

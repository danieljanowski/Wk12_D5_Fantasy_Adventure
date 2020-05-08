package creatures;

import behaviours.IDefend;
import enemies.Enemy;

public class Dragon implements IDefend {

    private String name;
    private int powerValue;

    public Dragon(String name, int powerValue) {
        this.name = name;
        this.powerValue = powerValue;
    }

    public String getName() {
        return name;
    }

    public int getPowerValue() {
        return powerValue;
    }

    public void defend(Enemy enemy) {
        enemy.takeDamage(powerValue);
    }
}

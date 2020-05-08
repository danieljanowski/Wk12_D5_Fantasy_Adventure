package healingItems;

import behaviours.IHeal;
import players.Player;

public class Potion implements IHeal {

    private int healingPoints;

    public Potion(int healingPoints) {
        this.healingPoints = healingPoints;
    }

    public int getHealingPoints() {
        return healingPoints;
    }

    public void heal(Player player) {
        player.getHealed(healingPoints);
    }
}

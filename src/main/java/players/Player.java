package players;

import enemies.Enemy;

public abstract class Player {

    private String name;
    private int healthPoints;

    public Player(String name, int healthPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void getHealed(int healingPoints){
        this.healthPoints += healingPoints;
    }

}

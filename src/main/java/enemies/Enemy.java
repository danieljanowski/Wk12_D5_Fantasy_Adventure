package enemies;

public abstract class Enemy {

    String name;
    int healthPoints;

    public Enemy(String name, int healthPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void takeDamage(int damageValue){
        this.healthPoints -= damageValue;
    }
}

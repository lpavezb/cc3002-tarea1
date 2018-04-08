package tarea;

public abstract class Attacker implements Unit {
    protected double healthPoints;
    protected double attackPoints;
    protected double maxHP;

    public boolean canFight(){
        boolean canFight = healthPoints > 0;
        return canFight;
    }

    public double getLife() {
        return healthPoints;
    }

    public double getMaxHP() {
        return maxHP;
    }

    public double getAttackPoints() {
        return attackPoints;
    }

    public void receiveDamage(double damage) {
        healthPoints -= damage;
        if (healthPoints < 0)
            healthPoints = 0;
    }
}

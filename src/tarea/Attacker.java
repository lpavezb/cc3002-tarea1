package tarea;

public abstract class Attacker implements Unit {
    protected double healthPoints;
    protected double attackPoints;

    public boolean canFight(){
        boolean canFight = healthPoints > 0;
        return canFight;
    }
    public double getLife() {
        return healthPoints;
    }

    public double getAttackPoints() {
        return attackPoints;
    }

}

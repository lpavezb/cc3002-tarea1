package tarea;

public abstract class Attacker implements Unit {
    protected double lifePoints;
    protected double attackPoints;

    public double getLife() {
        return lifePoints;
    }

    public double getAttackPoints() {
        return attackPoints;
    }

}

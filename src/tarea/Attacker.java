package tarea;

/**
 * Attacker is the abstract class for the objects that
 * attack
 *
 * @author Lukas Pavez
 */
public abstract class Attacker implements Unit {
    protected double healthPoints;
    protected double attackPoints;
    protected double maxHP;

    /**
     * method to see if the object can be hit
     *
     * @return boolean describing if the object life is greater than 0
     */
    public boolean canFight(){
        boolean canFight = healthPoints > 0;
        return canFight;
    }

    /**
     * method to obtain the life of the object
     *
     * @return healthPoints of the object
     */
    public double getLife() {
        return healthPoints;
    }

    /**
     * method to obtain the max HP of the object
     *
     * @return the maximum healthPoints of the object
     */
    public double getMaxHP() {
        return maxHP;
    }

    /**
     * method to obtain the attack points of the object
     *
     * @return attackPoints of the object
     */
    public double getAttackPoints() {
        return attackPoints;
    }

    /**
     * method to deal damage to the object
     */
    public void receiveDamage(double damage) {
        healthPoints -= damage;
        if (healthPoints < 0)
            healthPoints = 0;
    }
}

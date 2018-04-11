package tarea;

/**
 * AbstractAttackable is the abstract class for the objects that
 * receive attacks
 *
 * @author Lukas Pavez
 */
public abstract class AbstractAttackable{
    protected double healthPoints;
    protected double maxHP;

    /**
     * method to obtain the life of the object
     * @return healthPoints of the object
     */
    public double getLife() {
        return healthPoints;
    }

    /**
     * method to see if the object can fight
     *
     * @return boolean describing if the object life is greater than 0
     */
    public boolean canFight(){
        return healthPoints > 0;
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
     * method to deal damage
     */
    public void receiveDamage(double damage) {
        healthPoints -= damage;
        if (healthPoints < 0)
            healthPoints = 0;
    }
}

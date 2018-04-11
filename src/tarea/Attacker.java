package tarea;

/**
 * Attacker is the abstract class for the objects that
 * attack
 *
 * @author Lukas Pavez
 */
public abstract class Attacker extends AbstractAttackable implements Unit{
    protected double attackPoints;

    /**
     * method to obtain the attack points of the object
     *
     * @return attackPoints of the object
     */
    public double getAttackPoints() {
        return attackPoints;
    }
}

package tarea;

/**
 * AbstractAttacker is the abstract class for the objects that
 * attack
 *
 * @author Lukas Pavez
 */
public abstract class AbstractAttacker extends AbstractAttackable implements Unit{
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

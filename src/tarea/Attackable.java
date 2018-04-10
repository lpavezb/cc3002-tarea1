package tarea;


/**
 * Attackable is the abstract class for the objects that
 * cant attack (Rocks and FruitTrees)
 *
 * @author Lukas Pavez
 */
public abstract class Attackable implements AttackableObject {
    protected double healthPoints;

    /**
     * method to obtain the life of the object
     * @return healthPoints of the object
     */
    public double getLife() {
        return healthPoints;
    }

    /**
     * method to see if the object can be hit
     *
     * @return boolean describing if the object life is greater than 0
     */
    public boolean canBeHit(){
        boolean canBeHit = healthPoints > 0;
        return canBeHit;
    }


}

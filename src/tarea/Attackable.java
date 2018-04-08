package tarea;


/**
 * Attackable is the abstract class for the objects that
 * cant attack (Rocks and FruitTrees)
 *
 * @author Lukas Pavez
 */
public abstract class Attackable {
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

    /**
     * method to be hit by a Human object
     *
     * @param human Human that is attacking (Knight, FireMage or Priest)
     */
    public abstract void beHitBy(Human human);


    /**
     * method to be hit by a Unit object
     *
     * @param unit Unit that is attacking (Goblin, IceGolem or Undead)
     */
    public abstract void beHitBy(Unit unit);
}

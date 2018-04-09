package tarea;

/**
 * Rock is an Attackable object that damage Humans when hit
 *
 * @author Lukas Pavez
 */
public class Rock extends Attackable{

    public static final double INITIAL_LIFE_POINTS = 50;

    /**
     * class constructor
     */
    public Rock(){
        healthPoints = INITIAL_LIFE_POINTS;
    }

    /**
     * method to be hit by a Human object
     *
     * @param human Human that is attacking (Knight, FireMage or Priest)
     */
    @Override
    public void beHitBy(Human human) {
        if (this.canBeHit()){
            double damage = human.getAttackPoints();
            System.out.println("Rock was hit");
            this.healthPoints -= damage;
            System.out.println("Stupid human hit himself\n");
            human.receiveDamage(damage);
        }
        else
            System.out.println("Rock is destroyed, cannot be hit\n");
    }

    /**
     * method to be hit by a Unit object
     *
     * @param unit Unit that is attacking (Goblin, IceGolem or Undead)
     */
    @Override
    public void beHitBy(Unit unit) {
        //nonhuman Units doesn't attack rocks
    }
}

package tarea;

/**
 * FruitTree is an Attackable object that heals Humans and Goblins
 *
 * @author Lukas Pavez
 */
public class FruitTree extends Attackable{
    public static final double INITIAL_LIFE_POINTS = 50;


    /**
     * class constructor
     */
    public FruitTree(){
        healthPoints = INITIAL_LIFE_POINTS;
    }

    /**
     * method to be hit by a Human object
     *
     * @param human Human that is attacking (Knight, FireMage or Priest)
     */
    @Override
    public void beHitBy(Human human) {
        if (this.canBeHit()) {
            double damage = human.getAttackPoints();
            this.healthPoints -= damage;
            System.out.println("FruitTree hit, apple has fallen");
            double recover = 0.3 * human.getMaxHP();
            human.heal(0.3);
            System.out.println(human.getName() + " has eaten the apple");
            System.out.println(human.getName() + " has recovered " + recover + " HP\n");
        } else {
            System.out.println("FruitTree hit");
            System.out.println("FruitTree has run out of apples\n");
        }
    }

    /**
     * method to be hit by a Unit object
     *
     * @param unit Unit that is attacking (Goblin, IceGolem or Undead)
     */
    @Override
    public void beHitBy(Unit unit) {
        if (this.canBeHit()) {
            double damage = unit.getAttackPoints();
            this.healthPoints -= damage;
            System.out.println("FruitTree hit, apple has fallen");
            double recover = 0.15 * unit.getMaxHP();
            unit.heal(0.15);
            System.out.println("Goblin has eaten the apple");
            System.out.println(" Goblin has recovered " + recover + " HP\n");
        } else {
            System.out.println("FruitTree hit");
            System.out.println("FruitTree has run out of apples\n");
        }
    }

}

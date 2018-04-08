package tarea;

public class FruitTree extends Attackable{
    public static final double INITIAL_LIFE_POINTS = 50;

    //constructor Rock
    public FruitTree(){
        healthPoints = INITIAL_LIFE_POINTS;
    }

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

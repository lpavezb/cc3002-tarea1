package tarea;

/**
 * AbstractHuman is the abstract class for the human entities
 *
 * @author Lukas Pavez
 */
public abstract class AbstractHuman extends AbstractAttacker {
    protected String name;

    /**
     * method to obtain the name of the human
     *
     * @return name of the human
     */
    public String getName(){
        return name;
    }

    /**
     * method to fight against fruitTrees
     *
     * @param fruitTree fruitTree to fight
     */
    public void fight(FruitTree fruitTree){
        if (fruitTree.canFight() && this.canFight()) {
            double damage = this.getAttackPoints();
            fruitTree.receiveDamage(damage);
            System.out.println("FruitTree hit, apple has fallen");
            double recover = 0.3 * this.getMaxHP();
            this.heal(0.3);
            System.out.println(this.getName() + " has eaten the apple");
            System.out.println(this.getName() + " has recovered " + recover + " HP\n");
        }
    }

    /**
     * method to fight against rocks
     *
     * @param rock rock to attack
     */
    public void fight(Rock rock) {
        if (rock.canFight()){
            double damage = this.getAttackPoints();
            System.out.println("Rock was hit");
            this.healthPoints -= damage;
            System.out.println("Stupid human hit himself\n");
            rock.receiveDamage(damage);
        }
    }

    /**
     * method to heal the Human
     *
     * @param percentage number between 0-1, percentage to heal
     */
    public void heal(double percentage) {
        double max_hp = this.getMaxHP();
        double heal = max_hp * percentage;
        healthPoints += heal;
        if (healthPoints > max_hp)
            healthPoints = max_hp;
    }
}

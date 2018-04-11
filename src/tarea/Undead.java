package tarea;

/**
 * Undead is an AbstractAttacker Unit
 *
 * @author Lukas Pavez
 */
public class Undead extends AbstractAttacker {
    public static final double INITIAL_ATTACK_POINTS = 10;
    public static final double INITIAL_LIFE_POINTS = 100;

    /**
     * class constructor
     */
    public Undead(){
        healthPoints = INITIAL_LIFE_POINTS;
        maxHP = INITIAL_LIFE_POINTS;
        attackPoints = INITIAL_ATTACK_POINTS;
    }

    /**
     * method to fight against other Attackers
     *
     * @param u Units to attack
     */
    @Override
    public void fight(Unit u) {
        if(this.canFight())
            u.fightWith(this);
        else
            System.out.println("Undead cannot fight, unit is dead (again(?))\n");
    }

    /**
     * method to fight against fruitTrees
     *
     * @param fruitTree fruitTree to attack
     */
    @Override
    public void fight(FruitTree fruitTree) {
        //Undead doesnt attack fruitTrees
    }

    /**
     * method to fight against rocks
     *
     * @param rock rock to attack
     */
    @Override
    public void fight(Rock rock) {
        //Undead doesn't attack rocks
    }

    /**
     * method to fight against other units
     *
     * @param knight Knight attacking the Undead
     */
    @Override
    public void fightWith(Knight knight) {
        //Knight deals x1 to Undead
        double damage = knight.getAttackPoints();
        this.receiveDamage(damage);
    }

    /**
     * method to fight against other units
     *
     * @param fireMage FireMage attacking the Undead
     */
    @Override
    public void fightWith(FireMage fireMage) {
        //FireMage deals x0.5 to Undead
        double damage = 0.5 * fireMage.getAttackPoints();
        this.receiveDamage(damage);
    }

    /**
     * method to fight against other units
     *
     * @param priest Priest attacking the Undead
     */
    @Override
    public void fightWith(Priest priest) {
        //Priest deals x5 to Undead
        double damage = 5 * priest.getAttackPoints();
        this.receiveDamage(damage);
    }

    /**
     * method to fight against other units
     *
     * @param goblin Goblin attacking the Undead
     */
    @Override
    public void fightWith(Goblin goblin) {
        //Goblin doesnt attack Undead
    }

    /**
     * method to fight against other units
     *
     * @param iceGolem IceGolem attacking the Undead
     */
    @Override
    public void fightWith(IceGolem iceGolem) {
        //IceGolem deals x2 to Undead
        double damage = 2 * iceGolem.getAttackPoints();
        this.receiveDamage(damage);
    }

    /**
     * method to fight against other units
     *
     * @param undead Undead attacking the Undead
     */
    @Override
    public void fightWith(Undead undead) {
        //Undead doesn't attack Undead
    }

    /**
     * method to heal the Undead
     *
     * @param percentage number between 0-1, percentage to heal
     */
    @Override
    public void heal(double percentage) {
        //Undead does not heal
    }
}

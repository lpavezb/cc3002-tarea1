package tarea;

/**
 * IceGolem is an Attacker Unit
 *
 * @author Lukas Pavez
 */
public class IceGolem extends Attacker {
    public static final double INITIAL_ATTACK_POINTS = 10;
    public static final double INITIAL_LIFE_POINTS = 100;

    /**
     * class constructor
     */
    public IceGolem(){
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
            System.out.println("IceGolem cannot fight, unit is dead\n");
    }

    /**
     * method to fight against fruitTrees
     *
     * @param fruitTree fruitTree to attack
     */
    @Override
    public void fight(FruitTree fruitTree) {
        //IceGolem doesn't attack fruitTrees
    }

    /**
     * method to fight against rocks
     *
     * @param rock rock to attack
     */
    @Override
    public void fight(Rock rock) {
        //IceGolem doesn't attack rocks
    }

    /**
     * method to fight against other units
     *
     * @param knight Knight attacking the IceGolem
     */
    @Override
    public void fightWith(Knight knight) {
        //Knight deals x0.5 to IceGolem
        double damage = 0.5 * knight.getAttackPoints();
        this.receiveDamage(damage);
    }

    /**
     * method to fight against other units
     *
     * @param fireMage FireMage attacking the FireMage
     */
    @Override
    public void fightWith(FireMage fireMage) {
        //FireMage deals x5 to IceGolem
        double damage = 5 * fireMage.getAttackPoints();
        this.receiveDamage(damage);
    }

    /**
     * method to fight against other units
     *
     * @param priest Priest attacking the IceGolem
     */
    @Override
    public void fightWith(Priest priest) {
        //Priest doesn't attack to IceGolem
    }

    /**
     * method to fight against other units
     *
     * @param goblin Goblin attacking the IceGolem
     */
    @Override
    public void fightWith(Goblin goblin) {
        //Goblin doesn't attack IceGolem
    }

    /**
     * method to fight against other units
     *
     * @param iceGolem IceGolem attacking the IceGolem
     */
    @Override
    public void fightWith(IceGolem iceGolem) {
        //IceGolem deals x1 to IceGolem
        double damage = iceGolem.getAttackPoints();
        this.receiveDamage(damage);
    }

    /**
     * method to fight against other units
     *
     * @param undead Undead attacking the IceGolem
     */
    @Override
    public void fightWith(Undead undead) {
        //Undead doesn't attack IceGolem
    }

    /**
     * method to heal the IceGolem
     *
     * @param percentage number between 0-1, percentage to heal
     */
    @Override
    public void heal(double percentage) {
        //IceGolem does not heal
    }
}

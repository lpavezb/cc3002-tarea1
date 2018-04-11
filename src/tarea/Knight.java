package tarea;

/**
 * Knight is a AbstractHuman AbstractAttacker Unit
 *
 * @author Lukas Pavez
 */
public class Knight extends AbstractHuman {
    public static final double INITIAL_ATTACK_POINTS = 10;
    public static final double INITIAL_LIFE_POINTS = 100;

    /**
     * class constructor
     *
     * @param name name of the human
     */
    public Knight(String name){
        healthPoints = INITIAL_LIFE_POINTS;
        maxHP = INITIAL_LIFE_POINTS;
        attackPoints = INITIAL_ATTACK_POINTS;
        this.name = name;
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
            System.out.println("Knight " + this.getName() + " cannot fight, unit is dead\n");
    }

    /**
     * method to fight against other units
     *
     * @param knight Knight attacking the Knight
     */
    @Override
    public void fightWith(Knight knight) {
        //Knight deals x1 to Knight
        double damage = knight.getAttackPoints();
        this.receiveDamage(damage);
    }

    /**
     * method to fight against other units
     *
     * @param fireMage FireMage attacking the Knight
     */
    @Override
    public void fightWith(FireMage fireMage) {
        //FireMage deals x2 to Knight
        double damage = 2 * fireMage.getAttackPoints();
        this.receiveDamage(damage);
    }

    /**
     * method to fight against other units
     *
     * @param priest Priest attacking the Knight
     */
    @Override
    public void fightWith(Priest priest) {
        //Priest doesn't attack to Knight
    }

    /**
     * method to fight against other units
     *
     * @param goblin Goblin attacking the Knight
     */
    @Override
    public void fightWith(Goblin goblin) {
        //Goblin deals x0.5 to Knight
        double damage = 0.5 * goblin.getAttackPoints();
        this.receiveDamage(damage);
    }

    /**
     * method to fight against other units
     *
     * @param iceGolem IceGolem attacking the Knight
     */
    @Override
    public void fightWith(IceGolem iceGolem) {
        //IceGolem deals x1.5 to Knight
        double damage = 1.5 * iceGolem.getAttackPoints();
        this.receiveDamage(damage);
    }

    /**
     * method to fight against other units
     *
     * @param undead Undead attacking the Knight
     */
    @Override
    public void fightWith(Undead undead) {
        //Undead deals x1 to Knight
        double damage = undead.getAttackPoints();
        this.receiveDamage(damage);
    }
}

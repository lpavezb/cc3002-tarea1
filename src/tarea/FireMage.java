package tarea;

/**
 * FireMage is a AbstractHuman AbstractAttacker Unit
 *
 * @author Lukas Pavez
 */
public class FireMage extends AbstractHuman {
    public static final double INITIAL_ATTACK_POINTS = 10;
    public static final double INITIAL_LIFE_POINTS = 100;

    /**
     * class constructor
     *
     * @param name name of the human
     */
    public FireMage(String name){
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
            System.out.println("FireMage " + this.getName() + " cannot fight, unit is dead\n");
    }

    /**
     * method to fight against other units
     *
     * @param knight Knight attacking the FireMage
     */
    @Override
    public void fightWith(Knight knight) {
        //Knight deals x1.5 to FireMage
        double damage = 1.5 * knight.getAttackPoints();
        this.receiveDamage(damage);
    }

    /**
     * method to fight against other units
     *
     * @param fireMage FireMage attacking the FireMage
     */
    @Override
    public void fightWith(FireMage fireMage) {
        //FireMage deals x2 to FireMage
        double damage = 2 * fireMage.getAttackPoints();
        this.receiveDamage(damage);
    }

    /**
     * method to fight against other units
     *
     * @param priest Priest attacking the FireMage
     */
    @Override
    public void fightWith(Priest priest) {
        //Priest doesn't attack to FireMage
    }

    /**
     * method to fight against other units
     *
     * @param goblin Goblin attacking the FireMage
     */
    @Override
    public void fightWith(Goblin goblin) {
        //Goblin deals x1.5 to FireMage
        double damage = 1.5 * goblin.getAttackPoints();
        this.receiveDamage(damage);
    }

    /**
     * method to fight against other units
     *
     * @param iceGolem IceGolem attacking the FireMage
     */
    @Override
    public void fightWith(IceGolem iceGolem) {
        //IceGolem deals x2 a FireMage
        double damage = 2 * iceGolem.getAttackPoints();
        this.receiveDamage(damage);
    }

    /**
     * method to fight against other units
     *
     * @param undead Undead attacking the FireMage
     */
    @Override
    public void fightWith(Undead undead) {
        //Undead deals x1 to FireMage
        double damage = undead.getAttackPoints();
        this.receiveDamage(damage);
    }
}

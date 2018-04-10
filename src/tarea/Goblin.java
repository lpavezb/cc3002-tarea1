package tarea;

/**
 * Goblin is an Attacker Unit
 *
 * @author Lukas Pavez
 */
public class Goblin extends Attacker {
    public static final double INITIAL_ATTACK_POINTS = 10;
    public static final double INITIAL_LIFE_POINTS = 100;

    /**
     * class constructor
     */
    public Goblin(){
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
            System.out.println("Goblin cannot fight, unit is dead\n");
    }

    /**
     * method to fight against other units
     *
     * @param knight Knight attacking the Goblin
     */
    @Override
    public void fightWith(Knight knight) {
        //Knight deals x1.25 to Goblin
        double damage = 1.25 * knight.getAttackPoints();
        this.receiveDamage(damage);
    }

    /**
     * method to fight against other units
     *
     * @param fireMage FireMage attacking the Goblin
     */
    @Override
    public void fightWith(FireMage fireMage) {
        //FireMage deals x2 to Goblin
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
        //Priest doesn't attack to Goblin
    }

    /**
     * method to fight against other units
     *
     * @param goblin Goblin attacking the Goblin
     */
    @Override
    public void fightWith(Goblin goblin) {
        //Goblin doesn't attack Goblin
    }

    /**
     * method to fight against other units
     *
     * @param iceGolem IceGolem attacking the Goblin
     */
    @Override
    public void fightWith(IceGolem iceGolem) {
        //IceGolem deals x2 to Goblin
        double damage = 2 * iceGolem.getAttackPoints();
        this.receiveDamage(damage);
    }

    /**
     * method to fight against other units
     *
     * @param undead Undead attacking the Goblin
     */
    @Override
    public void fightWith(Undead undead) {
        //Undead deals x1 to Goblin
        double damage = undead.getAttackPoints();
        this.receiveDamage(damage);
    }

    /**
     * method to heal the Goblin
     *
     * @param percentage number between 0-1, percentage to heal
     */
    @Override
    public void heal(double percentage) {
        double max_hp = this.INITIAL_LIFE_POINTS;
        double heal = max_hp * percentage;
        healthPoints += heal;
        if (healthPoints > max_hp)
            healthPoints = max_hp;
    }
}

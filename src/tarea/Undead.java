package tarea;

/**
 * Undead is an Attacker Unit
 *
 * @author Lukas Pavez
 */
public class Undead extends Attacker {
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
     * method to attack Attackables
     *
     * @param attackable attackable to attack
     */
    @Override
    public void fight(Attackable attackable) {
        //Undead doesn't attack Attackables
    }

    /**
     * method to fight against other units
     *
     * @param human Human attacking the Undead
     */
    @Override
    public void fightWith(Human human) {
        //ataque depende de profecion
        double modifier = human.getUndeadModifier();
        double damage = modifier * human.getAttackPoints();
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

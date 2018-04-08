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
     * method to attack Attackables
     *
     * @param attackable attackable to attack
     */
    @Override
    public void fight(Attackable attackable) {
        //IceGolem no ataca Attackables
    }

    /**
     * method to fight against other units
     *
     * @param human Human attacking the IceGolem
     */
    @Override
    public void fightWith(Human human) {
        //ataque depende de profecion
        double modifier = human.getIceGolemModifier();
        double damage = modifier * human.getAttackPoints();
        this.receiveDamage(damage);
    }

    /**
     * method to fight against other units
     *
     * @param goblin Goblin attacking the IceGolem
     */
    @Override
    public void fightWith(Goblin goblin) {
        //Goblin no ataca a IceGolem
    }

    /**
     * method to fight against other units
     *
     * @param iceGolem IceGolem attacking the IceGolem
     */
    @Override
    public void fightWith(IceGolem iceGolem) {
        //IceGolem ataca normal a IceGolem
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
        //Undead no ataca a IceGolem
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

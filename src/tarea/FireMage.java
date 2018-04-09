package tarea;

/**
 * FireMage is a Human Attacker Unit
 *
 * @author Lukas Pavez
 */
public class FireMage extends Human {
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
     * method to attack Attackables
     *
     * @param attackable attackable to attack
     */
    @Override
    public void fight(Attackable attackable) {
        if(this.canFight())
            attackable.beHitBy(this);
        else
            System.out.println("FireMage " + this.getName() + " cannot fight, unit is dead\n");
    }

    /**
     * method to fight against other units
     *
     * @param human Human attacking the FireMage
     */
    @Override
    public void fightWith(Human human) {
        //attack depends on profession
        double modifier = human.getFireMageModifier();
        double damage = modifier * human.getAttackPoints();
        this.receiveDamage(damage);
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

    /**
     * method to heal the FireMage
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

    /**
     * modifier of FireMage attacking a Knight
     *
     * @return modifier of FireMage attacking a Knight
     */
    @Override
    public double getKnightModifier() {
        return 2;
    }

    /**
     * modifier of FireMage attacking a FireMAge
     *
     * @return modifier of FireMage attacking a FireMage
     */
    @Override
    public double getFireMageModifier() {
        return 2;
    }

    /**
     * modifier of FireMage attacking a Priest
     *
     * @return modifier of FireMage attacking a Priest
     */
    @Override
    public double getPriestModifier() {
        return 2;
    }

    /**
     * modifier of FireMage attacking a Goblin
     *
     * @return modifier of FireMage attacking a Goblin
     */
    @Override
    public double getGoblinModifier() {
        return 2;
    }

    /**
     * modifier of FireMage attacking an IceGolem
     *
     * @return modifier of FireMage attacking a IceGolem
     */
    @Override
    public double getIceGolemModifier() {
        return 5;
    }

    /**
     * modifier of FireMage attacking an Undead
     *
     * @return modifier of FireMage attacking an Undead
     */
    @Override
    public double getUndeadModifier() {
        return 0.5;
    }
}

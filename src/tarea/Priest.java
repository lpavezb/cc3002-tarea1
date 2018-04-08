package tarea;

public class Priest extends Human {
    public static final double INITIAL_ATTACK_POINTS = 10;
    public static final double INITIAL_LIFE_POINTS = 100;

    //constructor Priest
    public Priest(String name){
        healthPoints = INITIAL_LIFE_POINTS;
        maxHP = INITIAL_LIFE_POINTS;
        attackPoints = INITIAL_ATTACK_POINTS;
        this.name = name;
    }

    @Override
    public void fight(Unit u) {
        if(this.canFight())
            u.fightWith(this);
        else
            System.out.println("Priest " + this.getName() + " cannot fight, unit is dead\n");
    }

    @Override
    public void fight(Attackable attackable) {
        if(this.canFight())
            attackable.beHitBy(this);
        else
            System.out.println("Priest " + this.getName() + " cannot fight, unit is dead\n");
    }

    @Override
    public void fightWith(Human human) {
        //ataque depende de profecion
        double modifier = human.getPriestModifier();
        double damage = modifier * human.getAttackPoints();
        this.receiveDamage(damage);
    }

    @Override
    public void fightWith(Goblin goblin) {
        //Goblin ataca normal a Priest
        double damage = goblin.getAttackPoints();
        this.receiveDamage(damage);
    }

    @Override
    public void fightWith(IceGolem iceGolem) {
        //IceGolem ataca doble a Priest
        double damage = 2 * iceGolem.getAttackPoints();
        this.receiveDamage(damage);
    }

    @Override
    public void fightWith(Undead undead) {
        //Undead ataca normal a Priest
        double damage = undead.getAttackPoints();
        this.receiveDamage(damage);
    }

    @Override
    public void heal(double percentage) {
        double max_hp = this.INITIAL_LIFE_POINTS;
        double heal = max_hp * percentage;
        healthPoints += heal;
        if (healthPoints > max_hp)
            healthPoints = max_hp;
    }

    @Override
    public double getKnightModifier() {
        return 0;
    }

    @Override
    public double getFireMageModifier() {
        return 0;
    }

    @Override
    public double getPriestModifier() {
        return 0;
    }

    @Override
    public double getGoblinModifier() {
        return 0;
    }

    @Override
    public double getIceGolemModifier() {
        return 0;
    }

    @Override
    public double getUndeadModifier() {
        return 5;
    }
}

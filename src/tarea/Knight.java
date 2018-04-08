package tarea;

public class Knight extends Human {
    public static final double INITIAL_ATTACK_POINTS = 10;
    public static final double INITIAL_LIFE_POINTS = 100;

    //constructor Knight
    public Knight(String name){
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
            System.out.println("Knight " + this.getName() + " cannot fight, unit is dead\n");
    }

    @Override
    public void fight(Attackable attackable) {
        if(this.canFight())
            attackable.beHitBy(this);
        else
            System.out.println("Knight " + this.getName() + " cannot fight, unit is dead\n");
    }

    @Override
    public void fightWith(Human human) {
        //ataque depende de profecion
        double modifier = human.getKnightModifier();
        double damage = modifier * human.getAttackPoints();
        this.receiveDamage(damage);
    }

    @Override
    public void fightWith(Goblin goblin) {
        //Goblin ataca 0.5 a Knight
        double damage = 0.5 * goblin.getAttackPoints();
        this.receiveDamage(damage);
    }

    @Override
    public void fightWith(IceGolem iceGolem) {
        //IceGolem ataca 1.5 a Knight
        double damage = 1.5 * iceGolem.getAttackPoints();
        this.receiveDamage(damage);
    }

    @Override
    public void fightWith(Undead undead) {
        //Undead ataca normal a Knight
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
        return 1;
    }

    @Override
    public double getFireMageModifier() {
        return 1.5;
    }

    @Override
    public double getPriestModifier() {
        return 0;
    }

    @Override
    public double getGoblinModifier() {
        return 1.25;
    }

    @Override
    public double getIceGolemModifier() {
        return 0.5;
    }

    @Override
    public double getUndeadModifier() {
        return 1;
    }

}

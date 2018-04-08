package tarea;

public class Goblin extends Attacker {
    public static final double INITIAL_ATTACK_POINTS = 10;
    public static final double INITIAL_LIFE_POINTS = 100;

    //constructor Goblin
    public Goblin(){
        healthPoints = INITIAL_LIFE_POINTS;
        maxHP = INITIAL_LIFE_POINTS;
        attackPoints = INITIAL_ATTACK_POINTS;
    }

    @Override
    public void fight(Unit u) {
        if(this.canFight())
            u.fightWith(this);
        else
            System.out.println("Goblin cannot fight, unit is dead\n");
    }

    @Override
    public void fight(Attackable attackable) {
        if(this.canFight())
            attackable.beHitBy(this);
        else
            System.out.println("Goblin cannot fight, unit is dead\n");
    }

    @Override
    public void fightWith(Human human) {
        //ataque depende de profecion
        double modifier = human.getGoblinModifier();
        double damage = modifier * human.getAttackPoints();
        this.receiveDamage(damage);
    }

    @Override
    public void fightWith(Goblin goblin) {
        //Goblin no ataca a Goblin
    }

    @Override
    public void fightWith(IceGolem iceGolem) {
        //IceGolem ataca doble a Goblin
        double damage = 2 * iceGolem.getAttackPoints();
        this.receiveDamage(damage);
    }

    @Override
    public void fightWith(Undead undead) {
        //Undead ataca normal a goblin
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
}

package tarea;

public class Priest extends Human {
    public static final double INITIAL_ATTACK_POINTS = 10;
    public static final double INITIAL_LIFE_POINTS = 100;

    //constructor Priest
    public Priest(String name){
        lifePoints = INITIAL_LIFE_POINTS;
        attackPoints = INITIAL_ATTACK_POINTS;
        this.name = name;
    }

    @Override
    public void fight(Unit u) {
        u.fightWith(this);
    }

    @Override
    public void fightWith(Human human) {
        //ataque depende de profecion
        double modifier = human.getPriestModifier();
        double damage = modifier * human.getAttackPoints();
        lifePoints -= damage;
    }

    @Override
    public void fightWith(Goblin goblin) {
        //Goblin ataca normal a Priest
        double damage = goblin.getAttackPoints();
        lifePoints -= damage;
    }

    @Override
    public void fightWith(IceGolem iceGolem) {
        //IceGolem ataca doble a Priest
        double damage = 2 * iceGolem.getAttackPoints();
        lifePoints -= damage;
    }

    @Override
    public void fightWith(Undead undead) {
        //Undead ataca normal a Priest
        double damage = undead.getAttackPoints();
        lifePoints -= damage;
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
    public double getIceGolemModidier() {
        return 0;
    }

    @Override
    public double getUndeadModifier() {
        return 5;
    }
}

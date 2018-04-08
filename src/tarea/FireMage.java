package tarea;

public class FireMage extends Human {
    public static final double INITIAL_ATTACK_POINTS = 10;
    public static final double INITIAL_LIFE_POINTS = 100;

    //constructor FireMage
    public FireMage(String name){
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
        double modifier = human.getFireMageModifier();
        double damage = modifier * human.getAttackPoints();
        lifePoints -= damage;
    }

    @Override
    public void fightWith(Goblin goblin) {
        //Goblin ataca 1.5 a FireMage
        double damage = 1.5 * goblin.getAttackPoints();
        lifePoints -= damage;
    }

    @Override
    public void fightWith(IceGolem iceGolem) {
        //IceGolem ataca doble a FireMage
        double damage = 2 * iceGolem.getAttackPoints();
        lifePoints -= damage;
    }

    @Override
    public void fightWith(Undead undead) {
        //Undead ataca normal a FireMage
        double damage = undead.getAttackPoints();
        lifePoints -= damage;
    }

    @Override
    public double getKnightModifier() {
        return 2;
    }

    @Override
    public double getFireMageModifier() {
        return 2;
    }

    @Override
    public double getPriestModifier() {
        return 2;
    }

    @Override
    public double getGoblinModifier() {
        return 2;
    }

    @Override
    public double getIceGolemModidier() {
        return 5;
    }

    @Override
    public double getUndeadModifier() {
        return 0.5;
    }
}

package tarea;

public class Knight extends Human {
    public static final double INITIAL_ATTACK_POINTS = 10;
    public static final double INITIAL_LIFE_POINTS = 100;

    //constructor Knight
    public Knight(String name){
        healthPoints = INITIAL_LIFE_POINTS;
        attackPoints = INITIAL_ATTACK_POINTS;
        this.name = name;
    }

    @Override
    public void fight(Unit u) {
        if(this.canFight())
            u.fightWith(this);
        else
            System.out.println("Unidad muerta, no puede pelear");
    }

    @Override
    public void fightWith(Human human) {
        //ataque depende de profecion
        double modifier = human.getKnightModifier();
        double damage = modifier * human.getAttackPoints();
        healthPoints -= damage;
    }

    @Override
    public void fightWith(Goblin goblin) {
        //Goblin ataca 0.5 a Knight
        double damage = 0.5 * goblin.getAttackPoints();
        healthPoints -= damage;
    }

    @Override
    public void fightWith(IceGolem iceGolem) {
        //IceGolem ataca 1.5 a Knight
        double damage = 1.5 * iceGolem.getAttackPoints();
        healthPoints -= damage;
    }

    @Override
    public void fightWith(Undead undead) {
        //Undead ataca normal a Knight
        double damage = undead.getAttackPoints();
        healthPoints -= damage;
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

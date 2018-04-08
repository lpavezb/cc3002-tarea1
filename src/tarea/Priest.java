package tarea;

public class Priest extends Human {
    public static final double INITIAL_ATTACK_POINTS = 10;
    public static final double INITIAL_LIFE_POINTS = 100;

    //constructor Priest
    public Priest(String name){
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
        double modifier = human.getPriestModifier();
        double damage = modifier * human.getAttackPoints();
        healthPoints -= damage;
    }

    @Override
    public void fightWith(Goblin goblin) {
        //Goblin ataca normal a Priest
        double damage = goblin.getAttackPoints();
        healthPoints -= damage;
    }

    @Override
    public void fightWith(IceGolem iceGolem) {
        //IceGolem ataca doble a Priest
        double damage = 2 * iceGolem.getAttackPoints();
        healthPoints -= damage;
    }

    @Override
    public void fightWith(Undead undead) {
        //Undead ataca normal a Priest
        double damage = undead.getAttackPoints();
        healthPoints -= damage;
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

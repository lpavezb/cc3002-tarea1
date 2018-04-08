package tarea;

public class Undead extends Attacker {
    public static final double INITIAL_ATTACK_POINTS = 10;
    public static final double INITIAL_LIFE_POINTS = 100;

    //constructor Undead
    public Undead(){
        healthPoints = INITIAL_LIFE_POINTS;
        attackPoints = INITIAL_ATTACK_POINTS;
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
        double modifier = human.getUndeadModifier();
        double damage = modifier * human.getAttackPoints();
        healthPoints -= damage;
    }

    @Override
    public void fightWith(Goblin goblin) {
        //Goblin no ataca a Undead
    }

    @Override
    public void fightWith(IceGolem iceGolem) {
        //IceGolem ataca doble a Undead
        double damage = 2 * iceGolem.getAttackPoints();
        healthPoints -= damage;
    }

    @Override
    public void fightWith(Undead undead) {
        //Undead no ataca a Undead
    }
}

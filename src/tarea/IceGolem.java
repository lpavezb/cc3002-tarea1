package tarea;

public class IceGolem extends Attacker {
    public static final double INITIAL_ATTACK_POINTS = 10;
    public static final double INITIAL_LIFE_POINTS = 100;

    //constructor IceGolem
    public IceGolem(){
        lifePoints = INITIAL_LIFE_POINTS;
        attackPoints = INITIAL_ATTACK_POINTS;
    }

    @Override
    public void fight(Unit u) {
        u.fightWith(this);
    }

    @Override
    public void fightWith(Human human) {
        //ataque depende de profecion
        double modifier = human.getIceGolemModidier();
        double damage = modifier * human.getAttackPoints();
        lifePoints -= damage;
    }

    @Override
    public void fightWith(Goblin goblin) {
        //Goblin no ataca a IceGolem
    }

    @Override
    public void fightWith(IceGolem iceGolem) {
        //IceGolem ataca normal a IceGolem
        double damage = iceGolem.getAttackPoints();
        lifePoints -= damage;
    }

    @Override
    public void fightWith(Undead undead) {
        //Undead no ataca a IceGolem
    }
}

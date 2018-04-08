package tarea;

public interface Unit {

    void fight(Unit u);
    void fight(Attackable attackable);
    void fightWith(Human human);
    void fightWith(Goblin goblin);
    void fightWith(IceGolem iceGolem);
    void fightWith(Undead undead);

    double getMaxHP();
    double getLife();
    double getAttackPoints();

    void receiveDamage(double damage);
    void heal(double percentage);
}

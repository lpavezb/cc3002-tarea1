package tarea;

public interface Unit {
    void fight(Unit u);
    void fightWith(Human human);
    void fightWith(Goblin goblin);
    void fightWith(IceGolem iceGolem);
    void fightWith(Undead undead);

    double getLife();
}

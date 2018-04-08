package tarea;

/**
 * Interface for Units
 *
 * @author Lukas Pavez
 */
public interface Unit {

    /**
     * method to fight against other Attackers
     *
     * @param u Units to attack
     */
    void fight(Unit u);

    /**
     * method to attack Attackables
     *
     * @param attackable attackable to attack
     */
    void fight(Attackable attackable);

    /**
     * method to fight against other units
     *
     * @param human Human attacking the Unit
     */
    void fightWith(Human human);

    /**
     * method to fight against other units
     *
     * @param goblin Goblin attacking the Unit
     */
    void fightWith(Goblin goblin);

    /**
     * method to fight against other units
     *
     * @param iceGolem IceGolem attacking the Unit
     */
    void fightWith(IceGolem iceGolem);

    /**
     * method to fight against other units
     *
     * @param undead Undead attacking the Unit
     */
    void fightWith(Undead undead);

    /**
     * method to obtain the max HP of the object
     *
     * @return the maximum healthPoints of the object
     */
    double getMaxHP();

    /**
     * method to obtain the life of the object
     *
     * @return healthPoints of the object
     */
    double getLife();

    /**
     * method to obtain the attack points of the object
     *
     * @return attackPoints of the object
     */
    double getAttackPoints();

    /**
     * method to deal damage to the Unit
     */
    void receiveDamage(double damage);

    /**
     * method to heal the Unit
     *
     * @param percentage number between 0-1, percentage to heal
     */
    void heal(double percentage);
}

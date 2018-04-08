package tarea;

/**
 * Human is the abstract class for the professions of the human entities
 *
 * @author Lukas Pavez
 */
public abstract class Human extends Attacker{
    protected String name;

    /**
     * method to obtain the name of the human
     *
     * @return name of the human
     */
    public String getName(){
        return name;
    }

    /**
     * abstract method to attack Attackables
     *
     * @param attackable attackable to attack
     */
    public abstract void fight(Attackable attackable);

    /**
     * abstract method for the human attacking a Knight
     *
     * @return modifier of Human attacking a Knight
     */
    public abstract double getKnightModifier();

    /**
     * abstract method for the human attacking a FireMage
     *
     * @return modifier of Human attacking a FireMage
     */
    public abstract double getFireMageModifier();

    /**
     * abstract method for the human attacking a Priest
     *
     * @return modifier of Human attacking a Priest
     */
    public abstract double getPriestModifier();

    /**
     * abstract method for the human attacking a Goblin
     *
     * @return modifier of Human attacking a Goblin
     */
    public abstract double getGoblinModifier();

    /**
     * abstract method for the human attacking an IceGolem
     *
     * @return modifier of Human attacking an IceGolem
     */
    public abstract double getIceGolemModifier();

    /**
     * abstract method for the human attacking an Undead
     *
     * @return modifier of Human attacking an Undead
     */
    public abstract double getUndeadModifier();

}

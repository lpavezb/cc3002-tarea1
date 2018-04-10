package tarea;

/**
 * AbstractHuman is the abstract class for the human entities
 *
 * @author Lukas Pavez
 */
public abstract class AbstractHuman extends Attacker{
    protected String name;

    /**
     * method to obtain the name of the human
     *
     * @return name of the human
     */
    public String getName(){
        return name;
    }

}

package tarea;

public abstract class Human extends Attacker{
    protected String name;

    public String getName(){
        return name;
    }

    //retornan modificadores de cuanto se multiplica al atacar con la clase descrita
    public abstract void fight(Attackable attackable);
    public abstract double getKnightModifier();
    public abstract double getFireMageModifier();
    public abstract double getPriestModifier();
    public abstract double getGoblinModifier();
    public abstract double getIceGolemModifier();
    public abstract double getUndeadModifier();

}

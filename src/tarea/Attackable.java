package tarea;

public abstract class Attackable {
    protected double healthPoints;

    public double getLife() {
        return healthPoints;
    }

    public boolean canBeHit(){
        boolean canBeHit = healthPoints > 0;
        return canBeHit;
    }

    public abstract void beHitBy(Human human);
    public abstract void beHitBy(Unit unit);
}

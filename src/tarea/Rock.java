package tarea;

public class Rock extends Attackable{

    public static final double INITIAL_LIFE_POINTS = 50;

    //constructor Rock
    public Rock(){
        healthPoints = INITIAL_LIFE_POINTS;
    }

    @Override
    public void beHitBy(Human human) {
        if (this.canBeHit()){
            double damage = human.getAttackPoints();
            System.out.println("Rock was hit");
            this.healthPoints -= damage;
            System.out.println("Stupid human hit himself\n");
            human.receiveDamage(damage);
        }
        else
            System.out.println("Rock is destroyed, cannot be hit\n");
    }

    @Override
    public void beHitBy(Unit unit) {
        //Units no atacan rocas
    }
}

import tarea.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RockTest {
    private Unit knight;
    private Attackable rock;
    private Unit golem;
    private Unit goblin;
    private Unit undead;

    @Before
    public void setUp(){
        //everyone starts with 100 HP and 10 AP
        knight = new Knight("Sir knight");
        rock = new Rock();
        golem = new IceGolem();
        goblin = new Goblin();
        undead = new Undead();
    }

    @Test
    public void hitTest(){
        //Human hitTest
        knight.fight(rock);
        double damage = knight.getAttackPoints();
        double k_health = knight.getLife();
        double r_health = rock.getLife();
        assertEquals(90, k_health,0.01);
        assertEquals(40, r_health,0.01);

        //Unit hitTest
        golem.fight(rock);
        goblin.fight(rock);
        undead.fight(rock);
        double golem_health = golem.getLife();
        double goblin_health = golem.getLife();
        double u_health = golem.getLife();
        assertEquals(100, golem_health,0.01);
        assertEquals(100, goblin_health,0.01);
        assertEquals(100, u_health,0.01);
        assertEquals(40, r_health,0.01);
    }

    @Test
    public void rockDestroyedTest(){
        //destroy rock
        knight.fight(rock);
        knight.fight(rock);
        knight.fight(rock);
        knight.fight(rock);
        knight.fight(rock);
        assertEquals(0, rock.getLife(),0.01);
        assertEquals(50, knight.getLife(),0.01);

        //try to hit again
        knight.fight(rock);
        assertEquals(50, knight.getLife(),0.01);
    }
}
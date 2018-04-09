import tarea.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class UndeadTest {
    private Unit knight;
    private Unit fireMage;
    private Unit priest;
    private Unit goblin;
    private Unit iceGolem;
    private Unit undead;

    @Before
    public void setUp(){
        //everyone starts with 100 HP and 10 AP
        knight = new Knight("Sir knight");
        fireMage = new FireMage("Lord Mage");
        priest = new Priest("Saint Cleric");
        goblin = new Goblin();
        iceGolem = new IceGolem();
        undead = new Undead();
    }

    @Test
    public void AttackKnightTest(){
        //fight against a Knight (AP * 1 = 10)
        undead.fight(knight);
        double health = knight.getLife();
        double expected = 100 - 10;
        assertEquals(expected,health,0.01);
    }

    @Test
    public void AttackFireMageTest(){
        //fight against a FireMage (AP * 1 = 10)
        undead.fight(fireMage);
        double health = fireMage.getLife();
        double expected = 100 - 10;
        assertEquals(expected,health,0.01);
    }

    @Test
    public void AttackPriest(){
        //fight against a Priest (AP * 1 = 10)
        undead.fight(priest);
        double health = priest.getLife();
        double expected = 100 - 10;
        assertEquals(expected,health,0.01);
    }

    @Test
    public void AttackGoblin(){
        //fight against a Goblin (AP * 1 = 10)
        undead.fight(goblin);
        double health = goblin.getLife();
        double expected = 100 - 10;
        assertEquals(expected,health,0.01);
    }

    @Test
    public void AttackIceGolem(){
        //fight against a IceGolem (AP * 0 = 0)
        undead.fight(iceGolem);
        double health = iceGolem.getLife();
        double expected = 100;
        assertEquals(expected,health,0.01);
    }

    @Test
    public void AttackUndead(){
        //fight against a Undead (AP * 0 = 0)
        Undead zombie = new Undead();
        undead.fight(zombie);
        double health = zombie.getLife();
        double expected = 100;
        assertEquals(expected,health,0.01);
    }

    @Test
    public void cantFightDead(){
        //first undead must die
        priest.fight(undead); //50
        priest.fight(undead); //0

        double health = undead.getLife();
        assertEquals(0,health,0.01);

        Unit gob = new Goblin(); //new Goblin, 100 HP
        undead.fight(gob);
        health = gob.getLife();
        assertEquals(100, health,0.01);
    }
}

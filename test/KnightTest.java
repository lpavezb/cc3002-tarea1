import tarea.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class KnightTest {
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

    /*@Test
    public void nameTest(){
        String name = knight.getName();
        assertEquals("Sir knight", name);
    }*/

    @Test
    public void AttackKnightTest(){
        //fight against a Knight (AP * 1 = 10)
        Unit k2 = new Knight("THE KNIGHT");
        knight.fight(k2);
        double health = k2.getLife();
        double expected = 100 - 10;
        assertEquals(expected,health,0.01);
    }

    @Test
    public void AttackFireMageTest(){
        //fight against a FireMage (AP * 1.5 = 15)
        knight.fight(fireMage);
        double health = fireMage.getLife();
        double expected = 100 - 15;
        assertEquals(expected,health,0.01);
    }

    @Test
    public void AttackPriest(){
        //fight against a Priest (AP * 0 = 0)
        knight.fight(priest);
        double health = priest.getLife();
        double expected = 100;
        assertEquals(expected,health,0.01);
    }

    @Test
    public void AttackGoblin(){
        //fight against a Goblin (AP * 1.25 = 12.5)
        knight.fight(goblin);
        double health = goblin.getLife();
        double expected = 100 - 12.5;
        assertEquals(expected,health,0.01);
    }

    @Test
    public void AttackIceGolem(){
        //fight against a IceGolem (AP * 0.5 = 5)
        knight.fight(iceGolem);
        double health = iceGolem.getLife();
        double expected = 100 - 5;
        assertEquals(expected,health,0.01);
    }

    @Test
    public void AttackUndead(){
        //fight against a Undead (AP * 1 = 10)
        knight.fight(undead);
        double health = undead.getLife();
        double expected = 100 - 10;
        assertEquals(expected,health,0.01);
    }

    @Test
    public void cantFightDead(){
        //first knight must die
        fireMage.fight(knight); // 80
        fireMage.fight(knight); // 60
        fireMage.fight(knight); // 40
        fireMage.fight(knight); // 20
        fireMage.fight(knight); // 0

        double health = knight.getLife();
        assertEquals(0,health,0.01);

        Unit gob = new Goblin(); //new Goblin, 100 HP
        knight.fight(gob);
        health = gob.getLife();
        assertEquals(100, health,0.01);
    }
}

package test;

import tarea.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class IceGolemTest {
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
        //fight against a Knight (AP * 1.5 = 15)
        iceGolem.fight(knight);
        double health = knight.getLife();
        double expected = 100 - 15;
        assertEquals(expected,health,0.01);
    }

    @Test
    public void AttackFireMageTest(){
        //fight against a FireMage (AP * 2 = 20)
        iceGolem.fight(fireMage);
        double health = fireMage.getLife();
        double expected = 100 - 20;
        assertEquals(expected,health,0.01);
    }

    @Test
    public void AttackPriest(){
        //fight against a Priest (AP * 2 = 20)
        iceGolem.fight(priest);
        double health = priest.getLife();
        double expected = 100 - 20;
        assertEquals(expected,health,0.01);
    }

    @Test
    public void AttackGoblin(){
        //fight against a Goblin (AP * 2 = 20)
        iceGolem.fight(goblin);
        double health = goblin.getLife();
        double expected = 100 - 20;
        assertEquals(expected,health,0.01);
    }

    @Test
    public void AttackIceGolem(){
        //fight against a IceGolem (AP * 1 = 10)
        IceGolem golem = new IceGolem();
        iceGolem.fight(golem);
        double health = golem.getLife();
        double expected = 100 - 10;
        assertEquals(expected,health,0.01);
    }

    @Test
    public void AttackUndead(){
        //fight against a Undead (AP * 2 = 20)
        iceGolem.fight(undead);
        double health = undead.getLife();
        double expected = 100 - 20;
        assertEquals(expected,health,0.01);
    }
}

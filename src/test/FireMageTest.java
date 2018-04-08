package test;

import tarea.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FireMageTest {
    private Human knight;
    private Human fireMage;
    private Human priest;
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
    public void nameTest(){
        String name = fireMage.getName();
        assertEquals("Lord Mage", name);
    }

    @Test
    public void attackKnightTest(){
        //fight against a Knight (AP * 2 = 20)
        fireMage.fight(knight);
        double health = knight.getLife();
        double expected = 100 - 20;
        assertEquals(expected,health,0.01);
    }

    @Test
    public void attackFireMageTest(){
        //fight against a FireMage (AP * 2 = 20)
        FireMage f2 = new FireMage("King Mage");
        fireMage.fight(f2);
        double health = f2.getLife();
        double expected = 100 - 20;
        assertEquals(expected,health,0.01);
    }

    @Test
    public void attackPriest(){
        //fight against a Priest (AP * 2 = 20)
        fireMage.fight(priest);
        double health = priest.getLife();
        double expected = 100 - 20;
        assertEquals(expected,health,0.01);
    }

    @Test
    public void attackGoblin(){
        //fight against a Goblin (AP * 2 = 20)
        fireMage.fight(goblin);
        double health = goblin.getLife();
        double expected = 100 - 20;
        assertEquals(expected,health,0.01);
    }

    @Test
    public void attackIceGolem(){
        //fight against a IceGolem (AP * 5 = 50)
        fireMage.fight(iceGolem);
        double health = iceGolem.getLife();
        double expected = 100 - 50;
        assertEquals(expected,health,0.01);
    }

    @Test
    public void attackUndead(){
        //fight against a Undead (AP * 0.5 = 5)
        fireMage.fight(undead);
        double health = undead.getLife();
        double expected = 100 - 5;
        assertEquals(expected,health,0.01);
    }
}

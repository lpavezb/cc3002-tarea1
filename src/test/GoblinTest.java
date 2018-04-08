package test;

import tarea.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GoblinTest {
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
    public void attackKnightTest(){
        //fight against a Knight (AP * 0.5 = 5)
        goblin.fight(knight);
        double health = knight.getLife();
        double expected = 100 - 5;
        assertEquals(expected,health,0.01);
    }

    @Test
    public void AttackFireMageTest(){
        //fight against a FireMage (AP * 1.5 = 15)
        goblin.fight(fireMage);
        double health = fireMage.getLife();
        double expected = 100 - 15;
        assertEquals(expected,health,0.01);
    }

    @Test
    public void AttackPriest(){
        //fight against a Priest (AP * 1 = 10)
        goblin.fight(priest);
        double health = priest.getLife();
        double expected = 100 - 10;
        assertEquals(expected,health,0.01);
    }

    @Test
    public void AttackGoblin(){
        //fight against a Goblin (AP * 0 = 0)
        Goblin g2 = new Goblin();
        goblin.fight(g2);
        double health = g2.getLife();
        double expected = 100;
        assertEquals(expected,health,0.01);
    }

    @Test
    public void AttackIceGolem(){
        //fight against a IceGolem (AP * 0 = 0)
        goblin.fight(iceGolem);
        double health = iceGolem.getLife();
        double expected = 100;
        assertEquals(expected,health,0.01);
    }

    @Test
    public void AttackUndead(){
        //fight against a Undead (AP * 0 = 0)
        goblin.fight(undead);
        double health = undead.getLife();
        double expected = 100;
        assertEquals(expected,health,0.01);
    }
}


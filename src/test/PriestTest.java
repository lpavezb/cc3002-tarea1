package test;

import tarea.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PriestTest {
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
        String name = priest.getName();
        assertEquals("Saint Cleric", name);
    }

    @Test
    public void attackKnightTest(){
        //fight against a Knight (AP * 0 = 0)
        priest.fight(knight);
        double health = knight.getLife();
        double expected = 100;
        assertEquals(expected,health,0.01);
    }

    @Test
    public void attackFireMageTest(){
        //fight against a FireMage (AP * 0 = 0)
        priest.fight(fireMage);
        double health = fireMage.getLife();
        double expected = 100;
        assertEquals(expected,health,0.01);
    }

    @Test
    public void attackPriest(){
        //fight against a Priest (AP * 0 = 0)
        Priest p2 = new Priest("wololo");
        priest.fight(p2);
        double health = p2.getLife();
        double expected = 100;
        assertEquals(expected,health,0.01);
    }

    @Test
    public void attackGoblin(){
        //fight against a Goblin (AP * 0 = 0)
        priest.fight(goblin);
        double health = goblin.getLife();
        double expected = 100;
        assertEquals(expected,health,0.01);
    }

    @Test
    public void attackIceGolem(){
        //fight against a IceGolem (AP * 0 = 0)
        priest.fight(iceGolem);
        double health = iceGolem.getLife();
        double expected = 100;
        assertEquals(expected,health,0.01);
    }

    @Test
    public void attackUndead(){
        //fight against a Undead (AP * 5 = 50)
        priest.fight(undead);
        double health = undead.getLife();
        double expected = 100 - 50;
        assertEquals(expected,health,0.01);
    }

    @Test
    public void cantFightDead(){
        //first priest must die
        iceGolem.fight(priest); //80
        fireMage.fight(priest); //60
        iceGolem.fight(priest); //40
        fireMage.fight(priest); //20
        iceGolem.fight(priest); //0

        double health = priest.getLife();
        assertEquals(0,health,0.01);

        Unit zombie = new Undead(); //new Undead, 100 HP
        priest.fight(zombie);
        health = zombie.getLife();
        assertEquals(100, health,0.01);
    }
}


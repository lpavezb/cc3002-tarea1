import tarea.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FruitTreeTest {
    private Human knight;
    private Human mage;
    private Human priest;
    private Unit gob;
    private Unit golem;
    private Unit undead;
    private Attackable tree;

    @Before
    public void setUp(){
        //everyone starts with 100 HP and 10 AP
        knight = new Knight("Sir knight");
        mage = new FireMage("Lord Mage");
        priest = new Priest("Wololo");
        gob = new Goblin();
        golem = new IceGolem();
        undead = new Undead();
        tree = new FruitTree();
    }

    @Test
    public void humanHitTest(){
        //first damage humans
        knight.receiveDamage(40);
        mage.receiveDamage(40);
        priest.receiveDamage(40);

        knight.fight(tree);
        mage.fight(tree);
        priest.fight(tree);

        double k_health = knight.getLife();
        double m_health = knight.getLife();
        double p_health = knight.getLife();
        double t_health = tree.getLife();

        assertEquals(20, t_health,0.01);
        assertEquals(90, k_health,0.01);
        assertEquals(90, m_health,0.01);
        assertEquals(90, p_health,0.01);
    }

    @Test
    public void deadHumanHitTest(){
        //first kill all humans
        knight.receiveDamage(110);
        mage.receiveDamage(110);
        priest.receiveDamage(110);

        knight.fight(tree);
        mage.fight(tree);
        priest.fight(tree);

        double k_health = knight.getLife();
        double m_health = knight.getLife();
        double p_health = knight.getLife();
        double t_health = tree.getLife();

        assertEquals(50, t_health,0.01);
        assertEquals(0, k_health,0.01);
        assertEquals(0, m_health,0.01);
        assertEquals(0, p_health,0.01);
    }

    @Test
    public void unitHitTest(){
        //first damage goblin
        gob.receiveDamage(40);

        gob.fight(tree);

        double g_health = gob.getLife();
        double t_health = tree.getLife();

        assertEquals(40, t_health,0.01);
        assertEquals(75, g_health,0.01);

        //dead goblin test
        gob.receiveDamage(100);
        assertEquals(0,gob.getLife(),0.01);

        gob.fight(tree);
        assertEquals(40, t_health,0.01);
        assertEquals(0,gob.getLife(),0.01);
    }

    @Test
    public void treeDestroyedTest(){
        //destroy rock
        knight.fight(tree);
        knight.fight(tree);
        knight.fight(tree);
        knight.fight(tree);
        knight.fight(tree);

        assertEquals(0, tree.getLife(),0.01);

        knight.fight(tree);
        gob.fight(tree);

    }

    @Test
    public void cantHealMaxTest(){
        knight.fight(tree);
        mage.fight(tree);
        priest.fight(tree);
        gob.fight(tree);

        assertEquals(100, knight.getLife(),0.01);
        assertEquals(100, mage.getLife(),0.01);
        assertEquals(100, priest.getLife(),0.01);
        assertEquals(100, gob.getLife(),0.01);
    }

    @Test
    public void healTest(){
        gob.receiveDamage(20);
        gob.heal(1);
        assertEquals(100, gob.getLife(),0.01);

        golem.receiveDamage(20);
        golem.heal(1);
        assertEquals(80, golem.getLife(),0.01);

        undead.receiveDamage(20);
        undead.heal(1);
        assertEquals(80, undead.getLife(),0.01);
    }
}
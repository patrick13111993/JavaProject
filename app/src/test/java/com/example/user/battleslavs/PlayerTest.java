package com.example.user.battleslavs;
import com.example.user.battleslavs.Abilities.TestAbility;
import com.example.user.battleslavs.Slavs.*;
import org.junit.Before;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 20/12/2016.
 */
public class PlayerTest {

    Player player1;
    Piotr piotr;

    @Before
    public void before() {
        player1 = new Player();
        piotr = new Piotr();
        player1.assignName("Patrick");
        player1.assignSlav(piotr);
    }

    @Test
    public void testName() {
        assertEquals("Patrick", player1.returnName());
    }

    @Test
    public void testSlav() {
        assertEquals(piotr, player1.returnSlav());
    }
}

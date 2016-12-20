package com.example.user.battleslavs;

import com.example.user.battleslavs.Slavs.*;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 20/12/2016.
 */
public class SlavTest {

    Piotr piotr;
    Vlad vlad;
    TestSlav testslav;

    @Before
    public void before() {
        piotr = new Piotr();
        piotr.setup();
        vlad = new Vlad();
        vlad.setup();
        testslav = new TestSlav();
        testslav.setup();
    }

    @Test
    public void testPiotrHitpoints() {
        assertEquals(200.0, piotr.returnHitpoints());
    }

    @Test
    public void testCanUseAbilities() {
        Abilitable ability = testslav.abilities.get(0);
        ability.activate(piotr);
        assertEquals(160.0, piotr.returnHitpoints());
    }

    @Test
    public void testIsConscious() {
        assertEquals(true, testslav.isConscious());
    }
}

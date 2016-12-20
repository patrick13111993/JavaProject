package com.example.user.battleslavs;

import com.example.user.battleslavs.Abilities.*;
import com.example.user.battleslavs.Abilities.TestAbility;
import com.example.user.battleslavs.Slavs.*;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 20/12/2016.
 */
public class AbilityTest {

    TestAbility test;
    Piotr piotr;
    Vlad vlad;
    AK47 ak47;

    @Before
    public void before() {
        ak47 = new AK47();
        test = new TestAbility();
        piotr = new Piotr();
        piotr.setup();
        vlad = new Vlad();
    }

    @Test
    public void testDamage() {
        test.activate(piotr);
        assertEquals(160.0, piotr.returnHitpoints());
    }

    @Test
    public void testMessage() {
        assertEquals("Take that you capitalist pigdog", test.activate(vlad));
    }

    @Test
    public void testName() {
        String name = ak47.returnName();
        assertEquals("AK47", name);
    }
}
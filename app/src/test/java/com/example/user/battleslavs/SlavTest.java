package com.example.user.battleslavs;

import com.example.user.battleslavs.Slavs.Piotr;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 20/12/2016.
 */
public class SlavTest {

    Piotr piotr = new Piotr();

    @Before
    public void before() {
        piotr = new Piotr();
    }

    @Test
    public void testPiotrHitpoints() {
        piotr.setup();
        assertEquals(200.0, piotr.returnHitpoints());
    }
}
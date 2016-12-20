package com.example.user.battleslavs.Abilities;
import com.example.user.battleslavs.*;
import com.example.user.battleslavs.Abilitable;
import java.lang.Math;

/**
 * Created by user on 16/12/2016.
 */
public class EquipAdidas implements Abilitable {

    private double healing;
    private double attackMod;
    private double accuracy;
    private double crit;
    private String name;

    public EquipAdidas() {
        healing = 16;
        attackMod = 6;
        accuracy = 1;
        crit = 0.05;
        name = "EquipAdidas";
    }

    public String activate(Slavable target) {
        String msg = "You equip glorious tracksuit";
        double rand = Math.random();
        if (rand > accuracy) msg = "If this message appears something is fundamentally wrong with my code";
        if (rand < crit) {
            healing *= 1.5;
            attackMod *= 1.5;
            msg = "Babushka blesses you with one extra stripe";
        }
        target.receiveHealing(healing);
        target.attackModifier(attackMod);
        healing = 16;
        attackMod = 6;
        return msg;
    }

    public String returnName() {
        return name;
    }
}

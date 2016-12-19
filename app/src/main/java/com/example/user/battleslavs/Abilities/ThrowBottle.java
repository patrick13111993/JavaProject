package com.example.user.battleslavs.Abilities;
import com.example.user.battleslavs.*;
import com.example.user.battleslavs.Abilitable;
import java.lang.Math;

/**
 * Created by user on 16/12/2016.
 */
public class ThrowBottle implements Abilitable {

    private int damage;
    private int defenceMod;
    private double accuracy;
    private double crit;

    public ThrowBottle() {
        damage = 12;
        defenceMod = -4;
        accuracy = 0.85;
        crit = 0.05;
    }

    public String activate(Slav target) {
        String msg = "The bottle smashes, dealing damage and lowering your opponent's defence";
        double rand = Math.random();
        if (rand > accuracy) msg = "The attack missed!";
        if (rand < crit) {
            damage *= 1.5;
            msg = "It's a critical hit!";
        }
        target.takeDamage(damage);
        target.defenceModifier(defenceMod);
        damage = 12;
        return msg;
    }
}

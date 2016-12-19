package com.example.user.battleslavs.Abilities;
import com.example.user.battleslavs.*;
import com.example.user.battleslavs.Abilitable;
import java.lang.Math;

/**
 * Created by user on 16/12/2016.
 */
public class AK47 implements Abilitable {

    private int damage;
    private int defenceMod;
    private double accuracy;
    private double crit;

    public Ak47() {
        damage = 40;
        accuracy = 0.35;
        crit = 0.05;
    }

    public String activate(Slav target) {
        String msg = "Take that you capitalist pigdog";
        double rand = Math.random();
        if (rand > accuracy) msg = "Too much vodka comrade, try aiming next time";
        if (rand < crit) {
            damage *= 1.5;
            msg = "Right in the gulag";
        }
        target.takeDamage(damage);
        target.defenceModifier(defenceMod);
        damage = 40;
        return msg;
    }
}

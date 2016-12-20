package com.example.user.battleslavs.Abilities;
import com.example.user.battleslavs.*;
import com.example.user.battleslavs.Abilitable;
import java.lang.Math;

/**
 * Created by user on 16/12/2016.
 */
public class ThrowBottle implements Abilitable {

    private double damage;
    private double defenceMod;
    private double accuracy;
    private double crit;
    private String name;

    public ThrowBottle() {
        damage = 16;
        defenceMod = -4;
        accuracy = 0.85;
        crit = 0.05;
        name = "ThrowBottle";
    }

    public String activate(Slavable target) {
        String msg = "The bottle smashes, leaving your opponent with a sore head";
        double rand = Math.random();
        if (rand > accuracy) msg = "You threw a plastic bottle blyat";
        if (rand < crit) {
            damage *= 1.5;
            msg = "The bottle was full of vodka, your opponent's heart breaks at the wastage";
        }
        target.takeDamage(damage);
        target.defenceModifier(defenceMod);
        damage = 16;
        return msg;
    }

    public String returnName() {
        return name;
    }
}

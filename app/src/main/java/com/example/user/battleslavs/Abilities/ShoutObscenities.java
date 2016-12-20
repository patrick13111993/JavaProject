package com.example.user.battleslavs.Abilities;
import com.example.user.battleslavs.*;
import com.example.user.battleslavs.Abilitable;
import java.lang.Math;

/**
 * Created by user on 16/12/2016.
 */
public class ShoutObscenities implements Abilitable {

    private double damage;
    private double attackMod;
    private double accuracy;
    private double crit;
    private String name;

    public ShoutObscenities() {
        damage = 15;
        attackMod = -5;
        accuracy = 0.95;
        crit = 0.05;
        name = "ShoutObscenities";
    }

    public String activate(Slavable target) {
        String msg = "Kurwa! Blyat! Cyka!";
        double rand = Math.random();
        if (rand > accuracy) msg = "Your opponent is too drunk to be offended";
        if (rand < crit) {
            damage *= 1.5;
            msg = "Your opponent is deeply hurt by your slurs";
        }
        target.takeDamage(damage);
        target.attackModifier(attackMod);
        damage = 15;
        return msg;
    }

    public String returnName() {
        return name;
    }
}
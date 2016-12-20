package com.example.user.battleslavs.Abilities;
import com.example.user.battleslavs.*;
import com.example.user.battleslavs.Abilitable;
import java.lang.Math;

/**
 * Created by user on 16/12/2016.
 */
public class PutinsWrath implements Abilitable {

    private double damage;
    private double defenceMod;
    private double attackMod;
    private double accuracy;
    private double crit;

    public PutinsWrath() {
        damage = 26;
        attackMod = 4;
        defenceMod = 4;
        accuracy = 0.50;
        crit = 0.05;
    }

    public String activate(Slavable target) {
        String msg = "The horde ravages your opponent";
        double rand = Math.random();
        if (rand > accuracy) msg = "The soldiers are too drunk to fight";
        if (rand < crit) {
            damage *= 1.5;
            msg = "Putin is very annoyed and launches a nuke at your enemy";
        }
        target.takeDamage(damage);
        target.defenceModifier(defenceMod);
        damage = 40;
        return msg;
    }
}
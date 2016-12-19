package com.example.user.battleslavs.Abilities;
import com.example.user.battleslavs.*;
import com.example.user.battleslavs.Abilitable;
import java.lang.Math;

/**
 * Created by user on 16/12/2016.
 */
public class Squat implements Abilitable {

    private int healing;
    private int defenceMod;
    private double accuracy;
    private double crit;

    public Squat() {
        healing = 20;
        defenceMod = 4;
        accuracy = 1;
        crit = 0.05;
    }

    public String activate(Slav target) {
        String msg = "Heels on ground";
        double rand = Math.random();
        if (rand > accuracy) msg = "This should never happen!";
        if (rand < crit) {
            healing *= 1.5;
            msg = "It's a perfect squat!";
        }
        target.receiveHealing(healing);
        target.defenceModifier(defenceMod);
        healing = 20;
        return msg;
    }
}

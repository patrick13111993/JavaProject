package com.example.user.battleslavs.Abilities;
import com.example.user.battleslavs.*;
import com.example.user.battleslavs.Abilitable;
import java.lang.Math;

/**
 * Created by user on 16/12/2016.
 */
public class Squat implements Abilitable {

    private double healing;
    private double defenceMod;
    private double accuracy;
    private double crit;
    private String name;

    public Squat() {
        healing = 20;
        defenceMod = 6;
        accuracy = 1;
        crit = 0.05;
        name = "Squat";
    }

    public String activate(Slavable target) {
        String msg = "Heels on ground";
        double rand = Math.random();
        if (rand > accuracy) msg = "This message indicates a problem with the code";
        if (rand < crit) {
            healing *= 1.5;
            msg = "It's a perfect squat!";
        }
        target.receiveHealing(healing);
        target.defenceModifier(defenceMod);
        healing = 20;
        return msg;
    }

    public String returnName() {
        return name;
    }
}

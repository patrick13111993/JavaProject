package com.example.user.battleslavs.Abilities;
import com.example.user.battleslavs.*;
import com.example.user.battleslavs.Abilitable;
import java.lang.Math;

/**
 * Created by user on 16/12/2016.
 */
public class CommunistRegime implements Abilitable {

    private int attackMod;
    private int defenceMod;
    private double accuracy;
    private double crit;

    public CommunistRegime() {
        attackMod = 10;
        defenceMod = 10;
        accuracy = 0.65;
        crit = 0.05;
    }

    public String activate(Slav target) {
        String msg = "The regime was successul";
        double rand = Math.random();
        if (rand > accuracy) msg = "The revolution was unsuccessful";
        if (rand < crit) {
            attackMod *= 1.5;
            defenceMod *= 1.5;
            msg = "Glorious revolution";
        }
        target.attackModifier(attackMod);
        target.defenceModifier(defenceMod);
        attackMod = 10;
        defenceMod = 10;
        return msg;
    }
}

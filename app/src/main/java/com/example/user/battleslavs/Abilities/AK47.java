package com.example.user.battleslavs.Abilities;
import com.example.user.battleslavs.*;
import com.example.user.battleslavs.Abilitable;
import java.lang.Math;

/**
 * Created by user on 16/12/2016.
 */
public class AK47 implements Abilitable {

    private double damage;
    private double accuracy;
    private double crit;
    private String name;

    public AK47() {
        damage = 40;
        accuracy = 0.35;
        crit = 0.05;
        name = "AK47";
    }

    public String activate(Slavable target) {
        String msg = "Take that you capitalist pigdog";
        double rand = Math.random();
        if (rand > accuracy) msg = "Too much vodka comrade, you kill Boris the bear by mistake";
        if (rand < crit) {
            damage *= 1.5;
            msg = "Right in the gulag";
        }
        target.takeDamage(damage);
        damage = 40;
        return msg;
    }

    public String returnName() {
        return name;
    }
}

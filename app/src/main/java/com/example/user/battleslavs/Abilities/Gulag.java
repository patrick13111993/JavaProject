package com.example.user.battleslavs.Abilities;
import com.example.user.battleslavs.*;
import com.example.user.battleslavs.Abilitable;
import java.lang.Math;

/**
 * Created by user on 16/12/2016.
 */
public class Gulag implements Abilitable {

    private int damage;
    private double accuracy;
    private double crit;

    public Gulag() {
        damage = 20;
        accuracy = 0.80;
        crit = 0.05;
    }

    public String activate(Slav target) {
        String msg = "To the gulag with you, Amerikanski spijon.";
        double rand = Math.random();
        if (rand > accuracy) msg = "The attack missed!";
        if (rand < crit) {
            damage *= 1.5;
            msg = "It's a critical hit!";
        }
        target.takeDamage(damage);
        damage = 20;
        return msg;
    }
}
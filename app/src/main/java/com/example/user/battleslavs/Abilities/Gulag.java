package com.example.user.battleslavs.Abilities;
import com.example.user.battleslavs.*;
import com.example.user.battleslavs.Abilitable;
import java.lang.Math;

/**
 * Created by user on 16/12/2016.
 */
public class Gulag implements Abilitable {

    private double damage;
    private double accuracy;
    private double crit;
    private String name;

    public Gulag() {
        damage = 22;
        accuracy = 0.85;
        crit = 0.05;
        name = "Gulag";
    }

    public String activate(Slavable target) {
        String msg = "To the gulag with you, Amerikanski spijon.";
        double rand = Math.random();
        if (rand > accuracy) msg = "The gulag fails to contain your opponent.";
        if (rand < crit) {
            damage *= 1.5;
            msg = "Your opponent is left in isolation overnight";
        }
        target.takeDamage(damage);
        damage = 22;
        return msg;
    }

    public String returnName() {
        return name;
    }
}
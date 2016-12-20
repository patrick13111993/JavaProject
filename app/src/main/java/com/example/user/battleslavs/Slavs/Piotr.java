package com.example.user.battleslavs.Slavs;
import com.example.user.battleslavs.*;
import com.example.user.battleslavs.Abilitable;

import java.util.ArrayList;

/**
 * Created by user on 20/12/2016.
 */
public class Piotr implements Slavable {


    private ArrayList<Abilitable> abilities;
    private double hitpoints;
    private double attack;
    private double defence;

    public Piotr(ArrayList<Abilitable> abilities, double hitpoints, double attack, double defence) {
        this.abilities = abilities;
        this.hitpoints = hitpoints;
        this.attack = attack;
        this.defence = defence;
    }

    public void assignAbility(Abilitable ability) {
        abilities.add(ability);
    }

    public void takeDamage(double damage) {
        this.hitpoints -= damage;
    }

    public void receiveHealing(double healing) {
        this.hitpoints += healing;
    }

    public void attackModifier(double mod) {
        this.attack += mod;
    }

    public void defenceModifier(double mod) {
        this.defence += mod;
    }

    
}
package com.example.user.battleslavs;
import com.example.user.battleslavs.Abilities.*;

import java.util.ArrayList;

/**
 * Created by user on 16/12/2016.
 */
public class Slav {

    private ArrayList<Abilitable> abilities;
    private int hitpoints;
    private int attack;
    private int defence;

    public Slav(ArrayList<Abilitable> abilities, int hitpoints, int attack, int defence) {
        this.abilities = abilities;
        this.hitpoints = hitpoints;
        this.attack = attack;
        this.defence = defence;
    }

    public void useAbility(Abilitable ability) {

    }

    public void takeDamage(int damage) {
        this.hitpoints -= damage;
    }

    public void receiveHealing(int healing) {
        this.hitpoints += healing;
    }

    public void attackModifier(int mod) {
        this.attack += mod;
    }

    public void defenceModifier(int mod) {
        this.defence += mod;
    }
}

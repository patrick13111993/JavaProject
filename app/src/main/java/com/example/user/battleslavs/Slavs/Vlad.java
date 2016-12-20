package com.example.user.battleslavs.Slavs;
import com.example.user.battleslavs.*;
import com.example.user.battleslavs.Abilitable;
import com.example.user.battleslavs.Abilities.*;
import java.util.ArrayList;

/**
 * Created by user on 20/12/2016.
 */
public class Vlad implements Slavable {


    public ArrayList<Abilitable> abilities;
    private double hitpoints;
    private double attack;
    private double defence;

    public Vlad() {
        this.abilities = new ArrayList<Abilitable>();
    }

    public void assignAbility(Abilitable ability) {
        abilities.add(ability);
    }

    public void setup() {
        this.assignAbility(new CommunistRegime());
        this.assignAbility(new EquipAdidas());
        this.assignAbility(new AK47());
        this.assignAbility(new ShoutObscenities());
        hitpoints = 240;
        attack = 18;
        defence = 18;
    }

    public double returnHitpoints() {
        return hitpoints;
    }

    public boolean isConscious () {
        return hitpoints > 0;
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

    public ArrayList<Abilitable> returnAbilities(){
        return abilities;
    }
}
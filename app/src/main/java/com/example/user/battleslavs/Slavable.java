package com.example.user.battleslavs;
import com.example.user.battleslavs.Abilities.*;

import java.util.ArrayList;

/**
 * Created by user on 16/12/2016.
 */
public interface Slavable {

    public void assignAbility(Abilitable ability);

    public void takeDamage(double damage);

    public void receiveHealing(double healing);

    public void attackModifier(double mod);

    public void defenceModifier(double mod);

    public void setup();
}

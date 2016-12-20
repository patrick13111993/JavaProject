package com.example.user.battleslavs;

/**
 * Created by user on 16/12/2016.
 */
public class Player {

    private String name;
    private Slavable slavable;

    public Player() {
    }

    public void assignName(String name) {
        this.name = name;
    }

    public void assignSlav(Slavable slavable) {
        this.slavable = slavable;
    }



}

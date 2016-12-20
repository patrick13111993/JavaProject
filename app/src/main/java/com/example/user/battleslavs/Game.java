package com.example.user.battleslavs;

import java.util.ArrayList;

/**
 * Created by user on 16/12/2016.
 */
public class Game {

    private Player player1;
    private Player player2;
    private ArrayList<Player> players;

    public Game() {
        player1 = new Player();
        player2 = new Player();
    }

    public void assignPlayerName(Player player, String name) {
        player.assignName(name);
    }

    public void assignPlayerSlav(Player player, Slavable slavable) {
        player.assignSlav(slavable);
    }



    public void run() {

    }

}

//New turn function
//4 buttons with on-click behaviours (abilities)
//display health bars
//initial setup to display buttons
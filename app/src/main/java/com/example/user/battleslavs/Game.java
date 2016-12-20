package com.example.user.battleslavs;

import java.util.ArrayList;
import com.example.user.battleslavs.Slavs.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

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
        players.add(0, player1);
        players.add(1, player2);
    }

    public void assignPlayerName(Player player, String name) {

        player.assignName(name);
    }

    public void assignPlayerSlav(Player player, Slavable slavable) {

        player.assignSlav(slavable);
    }





    private void initialisePlayers() {
        for (int i = 0; i < players.size(); i++) {
            assignPlayerName(players.get(i), nameInput.toString());
            assignPlayerSlav(players.get(i), slavInput);
            players.get(i).returnSlav().setup();
        }

    }

    private void startBattle() {
        players.get(0).returnSlav().returnAbilities().get(index).activate(target);


       if (players.get(1).returnSlav().isConscious()) {
           Collections.rotate(players, 1);
           startBattle();
       }
    }

    public void run() {

        initialisePlayers();

    }

}

//    public void runWithTerminal() {
//        for (int i = 0; i < players.size(); i++) {
//            Scanner nameInput = new Scanner(System.in);
//            System.out.println(players.get(i).returnName() + " - enter your name: ");
//            int n = nameInput.nextInt();
//            assignPlayerName(players.get(i), nameInput.toString());
//        }
//    }

//New turn function
//4 buttons with on-click behaviours (abilities)
//display hitpoints
//initial setup to display buttons
package com.example.user.battleslavs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import com.example.user.battleslavs.Slavs.*;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by user on 16/12/2016.
 */
public class Game extends AppCompatActivity{
    private Player currentPlayer;
    EditText BeginEditText;
    Button startButton;
    private Player player1;
    private Player player2;
    private ArrayList<Player> players;
    private ArrayList<String> nameInput;
    private ArrayList<Slavable> slavInput;
    private static String[] slavs = {
        new Piotr().returnName(),
        new Vlad().returnName()
    };


    public Game() {
        player1 = new Player();
        player2 = new Player();
        players.add(player1);
        players.add(player2);
    }

    public Player returnCurrentPlayer() {
        return players.get(0);
    }

    public static String[] returnSlavs() {
        return slavs;
    }

    public void assignPlayerName(Player player, String name) {

        player.assignName(name);
    }

    public void assignPlayerSlav(Player player, Slavable slavable) {

        player.assignSlav(slavable);
    }



    private void initialisePlayers() {
        for (int i = 0; i < players.size(); i++) {
            assignPlayerName(players.get(i), nameInput.get(i).toString());
            assignPlayerSlav(players.get(i), slavInput.get(i));
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
        startBattle();

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
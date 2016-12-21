package com.example.user.battleslavs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.example.user.battleslavs.R;

/**
 * Created by user on 20/12/2016.
 */
public class GameActivity extends AppCompatActivity {
    TextView answerText;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Game game = new Game();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
    }

    private void setButtonText() {
        Player currentPlayer = game.returnCurrentPlayer();
        button1.setText(currentPlayer.returnSlav().returnAbilities().get(0).returnName());
        button2.setText(currentPlayer.returnSlav().returnAbilities().get(0).returnName());
        button3.setText(currentPlayer.returnSlav().returnAbilities().get(0).returnName());
        button4.setText(currentPlayer.returnSlav().returnAbilities().get(0).returnName());
    }
}

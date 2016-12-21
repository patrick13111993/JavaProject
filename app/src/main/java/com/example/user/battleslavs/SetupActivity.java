package com.example.user.battleslavs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.user.battleslavs.R;

import java.io.InputStream;
import java.util.ArrayList;

/**
 * Created by user on 21/12/2016.
 */
public class SetupActivity extends AppCompatActivity {
    ArrayAdapter arrayadap;
    Spinner spin1;
    Spinner spin2;
    Button setupButton;
    EditText player1name;
    EditText player2name;
    private ArrayList<String> nameInput;
    private ArrayList<Slavable> slavInput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup);
        spin1 = (Spinner) findViewById(R.id.spin1);
        spin2 = (Spinner) findViewById(R.id.spin2);
        setupButton = (Button) findViewById(R.id.setup_button);
        final String[] slavs = Game.returnSlavs();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, slavs);
        spin1.setAdapter(adapter);
        spin2.setAdapter(adapter);


        setupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player1name = (EditText) findViewById(R.id.player1name);
                player2name = (EditText) findViewById(R.id.player2name);


                String name1 = player1name.getText().toString();
                String name2 = player2name.getText().toString();

                nameInput = new ArrayList<String>();
                slavInput = new ArrayList<Slavable>();

                Intent intent = new Intent(EightBall.this, AnswerActivity.class);
                intent.putExtra("answer", randomAnswer);

                startActivity(intent);
            }
        });
    }
}


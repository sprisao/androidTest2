package com.brucechoe.androidtest2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ShowGuess extends AppCompatActivity {
    private TextView showGuessTextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_guess);

        showGuessTextview = findViewById(R.id.received_textview);


        if(
                getIntent().getStringExtra("guess") != null
        ){
        showGuessTextview.setText(getIntent().getStringExtra("guess"));
        }
    }
}
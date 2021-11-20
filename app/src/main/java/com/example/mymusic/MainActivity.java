package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnSelect ,btnPlay ,btnPause;
    TextView numberSong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSelect = findViewById(R.id.btnSelect);
        btnPlay = findViewById(R.id.btnPlay);
        btnPause = findViewById(R.id.btnPause);
        numberSong = findViewById(R.id.NumberSong);

        btnSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ControlActivity.class);
                startActivity(intent);
            }
        });;

        Intent intent = this.getIntent();

        numberSong.setText(intent.getStringExtra("bai1"));
        numberSong.setText(intent.getStringExtra("bai2"));
        numberSong.setText(intent.getStringExtra("bai3"));
        numberSong.setText(intent.getStringExtra("bai4"));
        numberSong.setText(intent.getStringExtra("bai5"));
        numberSong.setText(intent.getStringExtra("bai6"));
    }
}
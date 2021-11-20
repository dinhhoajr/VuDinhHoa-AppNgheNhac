package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ControlActivity extends AppCompatActivity {

    Button btnFirst ,btnSecond ,btnThird ,btnFour ,btnFive ,btnSix;
    Button btnSelect;
    TextView tvNumberSong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control);

        btnFirst = findViewById(R.id.btnSong1);
        btnSecond = findViewById(R.id.btnSong2);
        btnThird = findViewById(R.id.btnSong3);
        btnFour = findViewById(R.id.btnSong4);
        btnFive = findViewById(R.id.btnSong5);
        btnSix = findViewById(R.id.btnSong6);
        tvNumberSong = findViewById(R.id.tvNumberSong);

        btnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvNumberSong.setText("1");
                MediaPlayer song = MediaPlayer.create(ControlActivity.this,R.raw.bai11);
                song.start();
                Intent intent = new Intent(ControlActivity.this, com.example.mymusic.MainActivity.class);
                intent.putExtra("bai1","1");
                startActivity(intent);
            }
        });

        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvNumberSong.setText("2");
                MediaPlayer song = MediaPlayer.create(ControlActivity.this,R.raw.bai22);
                song.start();
                Intent intent = new Intent(ControlActivity.this, com.example.mymusic.MainActivity.class);
                intent.putExtra("bai2","2");
                startActivity(intent);
            }
        });

        btnThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvNumberSong.setText("3");
                MediaPlayer song = MediaPlayer.create(ControlActivity.this,R.raw.bai3);
                song.start();
                Intent intent = new Intent(ControlActivity.this, com.example.mymusic.MainActivity.class);
                intent.putExtra("bai3","3");
                startActivity(intent);
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvNumberSong.setText("4");
                MediaPlayer song = MediaPlayer.create(ControlActivity.this,R.raw.bai4);
                song.start();
                Intent intent = new Intent(ControlActivity.this, com.example.mymusic.MainActivity.class);
                intent.putExtra("bai4","4");
                startActivity(intent);
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvNumberSong.setText("5");
                MediaPlayer song = MediaPlayer.create(ControlActivity.this,R.raw.bai5);
                song.start();
                Intent intent = new Intent(ControlActivity.this, com.example.mymusic.MainActivity.class);
                intent.putExtra("bai5","5");
                startActivity(intent);
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvNumberSong.setText("6");
                MediaPlayer song = MediaPlayer.create(ControlActivity.this,R.raw.bai6);
                song.start();
                Intent intent = new Intent(ControlActivity.this, com.example.mymusic.MainActivity.class);
                intent.putExtra("bai6","6");
                startActivity(intent);
            }
        });
    }
}
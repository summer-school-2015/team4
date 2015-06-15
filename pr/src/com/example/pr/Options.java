package com.example.pr;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Options extends Activity{

    private MediaPlayer mediaPlayer;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.options);
        mediaPlayer = MediaPlayer.create(this, R.raw.yesterday);
        mediaPlayer.start();
    }

    public void Backtomain( View v){
        finish();
        Intent intent = new Intent(Options.this, MyActivity.class);
        startActivity(intent);

    }
}
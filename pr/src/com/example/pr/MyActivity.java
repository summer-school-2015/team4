package com.example.pr;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MyActivity extends Activity {

   /* int c1 = 0, n = 0, a1 = 0, c2 = 0, a2 = 0, damage1 = 0, damage2 = 0;

   public AnimationDrawable mAnimationDrawable;*/

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

    }


    public void toGame(View v) {
        finish();
        Intent intent = new Intent(MyActivity.this, game.class);
        startActivity(intent);

    }



    public void toOption(View v){
        setContentView(R.layout.options);
    }
    public void exit(View v){
        finish();
    }
}

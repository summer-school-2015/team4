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

public class game extends Activity{

        int c1 = 0, n = 0, a1 = 0, c2 = 0, a2 = 0, damage1 = 0, damage2 = 0, hp1 = 90, hp2 = 90;
        TextView textView7;
        public AnimationDrawable mAnimationDrawable, mAnimationDrawable1;
        public void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.game);
                animation();

        }
        public void fight(View v){
                Button button5 = (Button) findViewById(R.id.button5);
                Button button6 = (Button) findViewById(R.id.button6);
                Button button7 = (Button) findViewById(R.id.button7);
                textView7 = (TextView) findViewById(R.id.textView7);

                // if (v instanceof Button) {
                switch (n) {
                        case 0:
                                if (hp1 == 0 || hp2 == 0)
                                {
                                        finish();
                                        Intent intent = new Intent(game.this, MyActivity.class);
                                        startActivity(intent);
                                }
                                switch (v.getId()) {
                                        case R.id.button5:
                                                button5 = (Button) v;
                                                c1 = 1;
                                                break;
                                        case R.id.button6:
                                                button6 = (Button) v;
                                                c1 = 2;
                                                break;
                                        case R.id.button7:
                                                button7 = (Button) v;
                                                c1 = 3;
                                                break;
                                }
                                button5.setText("strong");
                                button6.setText("medium");
                                button7.setText("quick");
                                textView7.setText("Player1, choose power of your hit");
                                n = 1;
                                break;
                        case 1:
                                switch (v.getId()) {
                                        case R.id.button5:
                                                button5 = (Button) v;
                                                a1 = 3;
                                                break;
                                        case R.id.button6:
                                                button6 = (Button) v;
                                                a1 = 5;
                                                break;
                                        case R.id.button7:
                                                button7 = (Button) v;
                                                a1 = 7;
                                                break;

                                }

                                button5.setText("head");
                                button6.setText("body");
                                button7.setText("legs");
                                textView7.setText("Player2, choose destination of your hit");
                                n = 2;
                                break;
                        case 2:
                                switch (v.getId()) {
                                        case R.id.button5:
                                                button5 = (Button) v;
                                                c2 = 1;
                                                break;
                                        case R.id.button6:
                                                button6 = (Button) v;
                                                c2 = 2;
                                                break;
                                        case R.id.button7:
                                                button7 = (Button) v;
                                                c2 = 3;
                                                break;
                                }
                                button5.setText("strong");
                                button6.setText("medium");
                                button7.setText("quick");
                                textView7.setText("Player2, choose power of your hit");
                                n = 3;
                                break;
                        case 3:
                                switch (v.getId()) {
                                        case R.id.button5:
                                                button5 = (Button) v;
                                                a2 = 3;
                                                break;
                                        case R.id.button6:
                                                button6 = (Button) v;
                                                a2 = 5;
                                                break;
                                        case R.id.button7:
                                                button7 = (Button) v;
                                                a2 = 7;
                                                break;

                                }
                                getDamage();

                                button5.setText("head");
                                button6.setText("body");
                                button7.setText("legs");
                                if (hp1 != 0 && hp2 != 0)
                                  textView7.setText("Player1, choose destination of your hit");
                                n = 0;
                                break;
                }
        }


        public void getDamage(){
                TextView textView5 = (TextView) findViewById(R.id.textView5);
                TextView textView6 = (TextView) findViewById(R.id.textView6);
                textView7 = (TextView) findViewById(R.id.textView7);
                int q1 = 0, q2 = 10, q3 = 20;
                switch(c1 * a1) {
                        case 3:
                                switch(c2 * a2){
                                        case 3:
                                                damage1 = q2;
                                                damage2 = q2;
                                                break;
                                        case 5:
                                                damage1 = q1;
                                                damage2 = q3;
                                                break;
                                        case 7:
                                                damage1 = q1;
                                                damage2 = q3;
                                                break;
                                        case 6:
                                                damage1 = q1;
                                                damage2 = q3;
                                                break;
                                        case 10:
                                                damage1 = q3;
                                                damage2 = q1;
                                                break;
                                        case 14:
                                                damage1 = q3;
                                                damage2 = q1;
                                                break;
                                        case 9:
                                                damage1 = q3;
                                                damage2 = q1;
                                                break;
                                        case 15:
                                                damage1 = q2;
                                                damage2 = q2;
                                                break;
                                        case 21:
                                                damage1 = q2;
                                                damage2 = q2;
                                                break;
                                }
                                break;
                        case 5:
                                switch(c2 * a2){
                                        case 3:
                                                damage1 = q3;
                                                damage2 = q1;
                                                break;
                                        case 5:
                                                damage1 = q2;
                                                damage2 = q2;
                                                break;
                                        case 7:
                                                damage1 = q2;
                                                damage2 = q2;
                                                break;
                                        case 6:
                                                damage1 = q1;
                                                damage2 = q3;
                                                break;
                                        case 10:
                                                damage1 = q2;
                                                damage2 = q2;
                                                break;
                                        case 14:
                                                damage1 = q1;
                                                damage2 = q3;
                                                break;
                                        case 9:
                                                damage1 = q1;
                                                damage2 = q3;
                                                break;
                                        case 15:
                                                damage1 = q3;
                                                damage2 = q1;
                                                break;
                                        case 21:
                                                damage1 = q3;
                                                damage2 = q1;
                                                break;
                                }
                                break;
                        case 7:
                                switch(c2 * a2){
                                        case 3:
                                                damage1 = q3;
                                                damage2 = q1;
                                                break;
                                        case 5:
                                                damage1 = q2;
                                                damage2 = q2;
                                                break;
                                        case 7:
                                                damage1 = q2;
                                                damage2 = q2;
                                                break;
                                        case 6:
                                                damage1 = q2;
                                                damage2 = q2;
                                                break;
                                        case 10:
                                                damage1 = q3;
                                                damage2 = q1;
                                                break;
                                        case 14:
                                                damage1 = q1;
                                                damage2 = q3;
                                                break;
                                        case 9:
                                                damage1 = q1;
                                                damage2 = q3;
                                                break;
                                        case 15:
                                                damage1 = q3;
                                                damage2 = q1;
                                                break;
                                        case 21:
                                                damage1 = q1;
                                                damage2 = q3;
                                                break;
                                }
                                break;
                        case 6:
                                switch(c2 * a2){
                                        case 3:
                                                damage1 = q3;
                                                damage2 = q1;
                                                break;
                                        case 5:
                                                damage1 = q3;
                                                damage2 = q1;
                                                break;
                                        case 7:
                                                damage1 = q2;
                                                damage2 = q2;
                                                break;
                                        case 6:
                                                damage1 = q2;
                                                damage2 = q2;
                                                break;
                                        case 10:
                                                damage1 = q3;
                                                damage2 = q1;
                                                break;
                                        case 14:
                                                damage1 = q1;
                                                damage2 = q3;
                                                break;
                                        case 9:
                                                damage1 = q1;
                                                damage2 = q3;
                                                break;
                                        case 15:
                                                damage1 = q2;
                                                damage2 = q2;
                                                break;
                                        case 21:
                                                damage1 = q1;
                                                damage2 = q3;
                                                break;
                                }
                                break;
                        case 10:
                                switch(c2 * a2){
                                        case 1:
                                                damage1 = q1;
                                                damage2 = q3;
                                                break;
                                        case 5:
                                                damage1 = q2;
                                                damage2 = q2;
                                                break;
                                        case 7:
                                                damage1 = q1;
                                                damage2 = q3;
                                                break;
                                        case 6:
                                                damage1 = q1;
                                                damage2 = q3;
                                                break;
                                        case 10:
                                                damage1 = q2;
                                                damage2 = q2;
                                                break;
                                        case 14:
                                                damage1 = q2;
                                                damage2 = q2;
                                                break;
                                        case 9:
                                                damage1 = q3;
                                                damage2 = q1;
                                                break;
                                        case 15:
                                                damage1 = q3;
                                                damage2 = q1;
                                                break;
                                        case 21:
                                                damage1 = q3;
                                                damage2 = q1;
                                                break;
                                }
                                break;
                        case 14:
                                switch(c2 * a2){
                                        case 1:
                                                damage1 = q1;
                                                damage2 = q3;
                                                break;
                                        case 5:
                                                damage1 = q3;
                                                damage2 = q1;
                                                break;
                                        case 7:
                                                damage1 = q1;
                                                damage2 = q3;
                                                break;
                                        case 6:
                                                damage1 = q1;
                                                damage2 = q3;
                                                break;
                                        case 10:
                                                damage1 = q2;
                                                damage2 = q2;
                                                break;
                                        case 14:
                                                damage1 = q2;
                                                damage2 = q2;
                                                break;
                                        case 9:
                                                damage1 = q2;
                                                damage2 = q2;
                                                break;
                                        case 15:
                                                damage1 = q3;
                                                damage2 = q1;
                                                break;
                                        case 21:
                                                damage1 = q3;
                                                damage2 = q1;
                                                break;
                                }
                                break;
                        case 9:
                                switch(c2 * a2){
                                        case 1:
                                                damage1 = q1;
                                                damage2 = q3;
                                                break;
                                        case 5:
                                                damage1 = q3;
                                                damage2 = q1;
                                                break;
                                        case 7:
                                                damage1 = q3;
                                                damage2 = q1;
                                                break;
                                        case 6:
                                                damage1 = q3;
                                                damage2 = q1;
                                                break;
                                        case 10:
                                                damage1 = q1;
                                                damage2 = q3;
                                                break;
                                        case 14:
                                                damage1 = q2;
                                                damage2 = q2;
                                                break;
                                        case 9:
                                                damage1 = q2;
                                                damage2 = q2;
                                                break;
                                        case 15:
                                                damage1 = q1;
                                                damage2 = q3;
                                                break;
                                        case 21:
                                                damage1 = q2;
                                                damage2 = q2;
                                                break;
                                }
                                break;
                        case 15:
                                switch(c2 * a2){
                                        case 1:
                                                damage1 = q2;
                                                damage2 = q2;
                                                break;
                                        case 5:
                                                damage1 = q1;
                                                damage2 = q3;
                                                break;
                                        case 7:
                                                damage1 = q1;
                                                damage2 = q3;
                                                break;
                                        case 6:
                                                damage1 = q2;
                                                damage2 = q2;
                                                break;
                                        case 10:
                                                damage1 = q1;
                                                damage2 = q3;
                                                break;
                                        case 14:
                                                damage1 = q3;
                                                damage2 = q1;
                                                break;
                                        case 9:
                                                damage1 = q3;
                                                damage2 = q1;
                                                break;
                                        case 15:
                                                damage1 = q2;
                                                damage2 = q2;
                                                break;
                                        case 21:
                                                damage1 = q3;
                                                damage2 = q1;
                                                break;
                                }
                                break;
                        case 21:
                                switch(c2 * a2){
                                        case 1:
                                                damage1 = q2;
                                                damage2 = q2;
                                                break;
                                        case 5:
                                                damage1 = q1;
                                                damage2 = q3;
                                                break;
                                        case 7:
                                                damage1 = q3;
                                                damage2 = q1;
                                                break;
                                        case 6:
                                                damage1 = q3;
                                                damage2 = q1;
                                                break;
                                        case 10:
                                                damage1 = q1;
                                                damage2 = q3;
                                                break;
                                        case 14:
                                                damage1 = q3;
                                                damage2 = q1;
                                                break;
                                        case 9:
                                                damage1 = q2;
                                                damage2 = q2;
                                                break;
                                        case 15:
                                                damage1 = q1;
                                                damage2 = q3;
                                                break;
                                        case 21:
                                                damage1 = q2;
                                                damage2 = q2;
                                                break;
                                }
                                break;
                }
                hp1 = Integer.parseInt(textView5.getText().toString().substring(2, 4));
                hp2 = Integer.parseInt(textView6.getText().toString().substring(2, 4));
                hp1 -= damage1;
                if (hp1 < 0)
                        hp1 = 0;
                hp2 -= damage2;
                if (hp2 < 0)
                        hp2 = 0;
                if (hp1 != 90)
                        textView5.setText("hp" + String.valueOf(hp1) + "/90");
                if (hp2 != 90)
                        textView6.setText("hp" + String.valueOf(hp2) + "/90");

                if (hp1 == 0 || hp2 == 0)
                {
                        animationwin();
                        if (hp1 == 0)
                                textView7.setText("Pavel won!!");
                        else
                                textView7.setText("Kirk won!!");
                }
        }
        public void Backtomain( View v){
                finish();
                Intent intent = new Intent(game.this, MyActivity.class);
                startActivity(intent);

        }
        public void  animation() {
                ImageView imageView = (ImageView) findViewById(R.id.imageView4);
                imageView.setBackgroundResource(R.drawable.cutanimation);
                mAnimationDrawable = (AnimationDrawable) imageView.getBackground();
                mAnimationDrawable.start();
                ImageView imageView2 = (ImageView) findViewById(R.id.imageView3);
                imageView2.setBackgroundResource(R.drawable.cutanimation1);
                mAnimationDrawable1 = (AnimationDrawable) imageView2.getBackground();
                mAnimationDrawable1.start();
        }
        public void animationwin(){
                mAnimationDrawable.stop();
                mAnimationDrawable1.stop();

        }

}
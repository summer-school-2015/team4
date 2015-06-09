package com.example.pr;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MyActivity extends Activity {

    int c1 = 0, n = 0, a1 = 0, c2 = 0, a2 = 0, damage1 = 0, damage2 = 0;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }


    public void toGame(View v) {
        setContentView(R.layout.game);
    }

    public void fight(View v) {
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);

       // if (v instanceof Button) {
            switch (n) {
                case 0:
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
                    //animation();
                    button5.setText("head");
                    button6.setText("body");
                    button7.setText("legs");
                    n = 0;
                    break;
            }
        }
    //}

    public void getDamage(){

    }
    public void  animation(){

    }
}

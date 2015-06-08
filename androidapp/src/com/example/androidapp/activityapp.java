package com.example.androidapp;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activityapp extends Activity implements View.OnClickListener {

    Button button;
    Button button2;
    Button button3;
    TextView TextView;
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.main);

            button = (Button) findViewById(R.id.button);
            button.setOnClickListener(this);

            button2 = (Button) findViewById(R.id.button2);
            button2.setOnClickListener(this);

            button3 = (Button) findViewById(R.id.button3);
            button3.setOnClickListener(this);

            TextView = (TextView) findViewById(R.id.ppp);
        }

        public void onClick(View v) {

           /* Button button = null;
            Button button2 = null;
            Button button3 = null;*/
            int clicks3 = 0;
            int clicks2 = 0;
            int clicks1 = 0;
            int c =  Integer.parseInt(TextView.getText().toString());;
            clicks1 = Integer.parseInt(button.getText().toString());
            clicks2 = Integer.parseInt(button2.getText().toString());
            clicks3 = Integer.parseInt(button3.getText().toString());
            if (v instanceof Button) {
                switch (v.getId()) {
                    case R.id.button:
                        button = (Button)v;

                        clicks1++;
                        button.setText(String.valueOf(clicks1));
                        break;
                    case R.id.button2:
                        button2 = (Button)v;

                        clicks2++;
                        button2.setText(String.valueOf(clicks2));
                        break;
                    case R.id.button3:
                        button3 = (Button)v;

                        clicks3++;
                        button3.setText(String.valueOf(clicks3));
                        break;
                }
                boolean flag = true;
                int sum = clicks1 + clicks2 + clicks3;
                for (int i = 2; i < sum; i++) {
                    if (sum % i == 0) {
                        flag = false;
                    }
                }

                if (flag) {
                    c++;
                    button.setBackgroundColor(Color.BLUE);
                    button2.setBackgroundColor(Color.BLUE);
                    button3.setBackgroundColor(Color.BLUE);
                    TextView.setText(String.valueOf(c));
                } else {
                    button.setBackgroundColor(Color.GREEN);
                    button2.setBackgroundColor(Color.GREEN);
                    button3.setBackgroundColor(Color.GREEN);
                }

            }
        }
    }
/*public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}*/

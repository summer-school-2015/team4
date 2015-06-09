package com.example.pr;

        import android.app.Activity;
        import android.content.Intent;
        import android.graphics.Color;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

public class game extends Activity{

        public void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.game);

        }
        public void fight(View v){
                int c = 0;
                Button button5;
                Button button6;
                Button button7;
                if (v instanceof Button) {
                        switch (v.getId()) {
                                case R.id.button5:
                                        button5 = (Button)v;
                                        c = 1;
                                        button5.setText("strong");
                                        break;
                                case R.id.button6:
                                        button6 = (Button)v;
                                        c = 2;
                                        button6.setText("medium");
                                        break;
                                case R.id.button7:
                                        button7 = (Button)v;
                                        c = 3;
                                        button7.setText("quick");
                                        break;
                        }
                }
        }
}
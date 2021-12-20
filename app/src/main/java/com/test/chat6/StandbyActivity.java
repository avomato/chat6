package com.test.chat6;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;



import androidx.appcompat.app.AppCompatActivity;

public class StandbyActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.standby_main);

        Handler mHandler = new Handler();
        mHandler.postDelayed(new Runnable() {
            public void run() {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
                finish();
            }
        }, 3000);
    }

    @Override
    protected void onPause(){
        super.onPause();
        finish();
    }
}









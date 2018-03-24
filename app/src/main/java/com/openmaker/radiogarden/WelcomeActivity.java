package com.openmaker.radiogarden;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class WelcomeActivity extends AppCompatActivity {
    private final int SPLASH_DISPLAY_LENGTH = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        getSupportActionBar().hide();

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                //Intent mainIntent = new Intent(getApplicationContext(), MainActivity.class);
                //Splash.this.startActivity(mainIntent);
                startActivity(new Intent(getApplicationContext(), radioStationsMain.class));
                WelcomeActivity.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);



        //
    }
}

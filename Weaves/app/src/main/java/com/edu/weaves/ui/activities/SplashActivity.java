package com.edu.weaves.ui.activities;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.edu.weaves.R;

public class SplashActivity extends ParentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int SPLASH_TIME_OUT = 1000;
        if (session.isFirstTimeLaunch()) {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(SplashActivity.this, TutorialActivity.class);
                    startActivity(intent);
                    finish();
                }
            }, SPLASH_TIME_OUT);
        } else {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }, SPLASH_TIME_OUT);
        }
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.splash_activity;
    }
}

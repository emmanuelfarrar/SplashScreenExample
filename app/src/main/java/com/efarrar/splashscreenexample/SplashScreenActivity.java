package com.efarrar.splashscreenexample;

/**
 * URL 1: https://github.com/pantrif/EasySplashScreen
 * URL 2: https://codinginflow.com/tutorials/android/easy-splash-screen
 */

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import gr.net.maroulis.library.EasySplashScreen;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setting config details for splashscreen
        EasySplashScreen config = new EasySplashScreen(SplashScreenActivity.this)
                .withFullScreen()
                .withTargetActivity(MainActivity.class)
                .withSplashTimeOut(5000)
                .withBackgroundColor(Color.parseColor("#424354"))
                .withHeaderText("Header")
                .withFooterText("Footer")
                .withBeforeLogoText("Before Logo Text")
                .withAfterLogoText("After Logo Text")
                .withLogo(R.drawable.logo);

        //setting the text color
        config.getHeaderTextView().setTextColor(Color.WHITE);
        config.getFooterTextView().setTextColor(Color.WHITE);
        config.getBeforeLogoTextView().setTextColor(Color.WHITE);
        config.getAfterLogoTextView().setTextColor(Color.WHITE);

        //applying all the config details and setting the setContentView to the view created with said configs
        View easySplashScreen = config.create();
        setContentView(easySplashScreen);

    }
}

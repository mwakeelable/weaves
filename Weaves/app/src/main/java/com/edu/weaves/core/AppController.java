package com.edu.weaves.core;

import android.app.Application;

import java.util.Locale;

public class AppController extends Application {
    public static final String TAG = AppController.class.getSimpleName();
    private static AppController mInstance;

    public static synchronized AppController getInstance() {
        return mInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        SharedManager prefs = new SharedManager();
        String appLanguage = prefs.getLanguage(this);
        if (!Locale.getDefault().getLanguage().equalsIgnoreCase(appLanguage)) {
            LocaleUtils.changeLocale(getApplicationContext(), appLanguage);
        }
    }
}

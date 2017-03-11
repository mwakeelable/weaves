package com.edu.weaves.core;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.edu.weaves.ui.activities.LoginActivity;

import java.util.HashMap;


public class SessionManager {
    public SharedPreferences pref;
    public SharedPreferences settings_pref;
    public SharedPreferences.Editor editor;
    public Context mContext;
    public int PRIVATE_MODE = 0;
    public static final String PREF_NAME = AppController.TAG;
    public static final String IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch";
    public static final String IS_LOGIN = "IsLoggedIn";
    public static final String KEY_NAME = "username";
    public static final String KEY_ID = "userID";

    public SessionManager(Context context) {
        this.mContext = context;
        pref = mContext.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
        settings_pref = PreferenceManager.getDefaultSharedPreferences(mContext);
    }

    public void setFirstTimeLaunch(boolean isFirstTime) {
        editor.putBoolean(IS_FIRST_TIME_LAUNCH, isFirstTime);
        editor.commit();
    }

    public boolean isFirstTimeLaunch() {
        return pref.getBoolean(IS_FIRST_TIME_LAUNCH, true);
    }

    public void createLoginSession(int id, String username) {
        editor.putBoolean(IS_LOGIN, true);
        editor.putInt(KEY_ID, id);
        editor.putString(KEY_NAME, username);
        editor.commit();
    }

    public HashMap<String, String> getUserDetails() {
        HashMap<String, String> user = new HashMap<String, String>();
        user.put(KEY_ID, String.valueOf(pref.getInt(KEY_ID, 1)));
        user.put(KEY_NAME, pref.getString(KEY_NAME, null));
        return user;
    }

    public void checkLogin() {
        // Check login status
        if (!this.isLoggedIn()) {
            Intent i = new Intent(mContext, LoginActivity.class);
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            mContext.startActivity(i);
        }
    }

    public void logoutUser() {
        editor.clear();
        editor.commit();
        Intent i = new Intent(mContext, LoginActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        mContext.startActivity(i);
        setFirstTimeLaunch(false);
    }

    public boolean isLoggedIn() {
        return pref.getBoolean(IS_LOGIN, false);
    }
}

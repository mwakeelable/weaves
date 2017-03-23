package com.edu.weaves.ui.activities;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.edu.weaves.core.SessionManager;
import com.edu.weaves.core.SharedManager;
import com.edu.weaves.database.DatabaseHandle;

public abstract class ParentActivity extends AppCompatActivity {
    public SessionManager session;
    public SharedManager manager;
    DatabaseHandle db = new DatabaseHandle(this);

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResourceId());
        session = new SessionManager(this);
        manager = new SharedManager();
    }

    protected abstract int getLayoutResourceId();

    public void openActivity(Class<?> activity) {
        Intent intent = new Intent(this, activity);
        startActivity(intent);
    }
}

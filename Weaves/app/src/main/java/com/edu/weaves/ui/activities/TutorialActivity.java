package com.edu.weaves.ui.activities;

import android.os.Bundle;

import com.edu.weaves.R;
import com.edu.weaves.ui.fragments.TutorialFragment;

public class TutorialActivity extends ParentActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, TutorialFragment.instance())
                    .commit();
        }
    }
    @Override
    protected int getLayoutResourceId() {
        return R.layout.tutorial_activity;
    }
}

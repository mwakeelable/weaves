package com.edu.weaves.ui.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;

import com.edu.weaves.R;

public class PlainActivity extends ParentActivity {
    LinearLayout btn_level1, btn_level2, btn_level3, btn_level4, btn_level5, btn_level6, btn_level7, btn_level8;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(getResources().getString(R.string.txt_plain_activity));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btn_level1 = (LinearLayout) findViewById(R.id.plain_one);
        btn_level2 = (LinearLayout) findViewById(R.id.plain_two);
        btn_level3 = (LinearLayout) findViewById(R.id.plain_three);
        btn_level4 = (LinearLayout) findViewById(R.id.plain_four);
        btn_level5 = (LinearLayout) findViewById(R.id.plain_five);
        btn_level6 = (LinearLayout) findViewById(R.id.plain_six);
        btn_level7 = (LinearLayout) findViewById(R.id.plain_seven);
        btn_level8 = (LinearLayout) findViewById(R.id.plain_eight);

        btn_level1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(PlainLevelsActivity.class);
            }
        });
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.plain_activity;
    }
}

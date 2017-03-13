package com.edu.weaves.ui.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.edu.weaves.R;

public class AccountActivity extends ParentActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ImageView btn_back = (ImageView) findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        TextView txt_name = (TextView) findViewById(R.id.txt_user_name);
        TextView txt_age = (TextView) findViewById(R.id.txt_user_age);
        TextView txt_score = (TextView) findViewById(R.id.txt_user_score);
        txt_name.setText(db.getUser(1).getName());
        txt_age.setText(String.valueOf(db.getUser(1).getAge()));
        txt_score.setText(String.valueOf(db.getUser(1).getScore()));
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.account_activity;
    }
}

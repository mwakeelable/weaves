package com.edu.weaves.ui.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.afollestad.materialdialogs.MaterialDialog;
import com.edu.weaves.R;
import com.edu.weaves.database.DatabaseHandle;
import com.edu.weaves.models.Users;

import java.util.ArrayList;

public class RegisterActivity extends ParentActivity {
    EditText txt_name, txt_age;
    Button btn_register;

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
        txt_name = (EditText) findViewById(R.id.txt_name);
        txt_age = (EditText) findViewById(R.id.txt_age);
        btn_register = (Button) findViewById(R.id.btn_register);
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doRegister();
            }
        });
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.register_activity;
    }

    private void doRegister() {
        if (txt_name.getEditableText().toString().equals("") ||
                txt_age.getEditableText().toString().equals("")) {
            new MaterialDialog.Builder(RegisterActivity.this)
                    .title(getResources().getString(R.string.txt_error))
                    .content(getResources().getString(R.string.register_error))
                    .positiveText(getResources().getString(R.string.txt_ok))
                    .show();
        } else {
            Users user = new Users
                    (txt_name.getEditableText().toString(),
                            Integer.valueOf(txt_age.getEditableText().toString()),
                            0);
            db.addUser(user);
            session.createLoginSession(0, txt_name.getEditableText().toString());
            openActivity(MainActivity.class);
        }
    }
}

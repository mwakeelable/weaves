package com.edu.weaves.ui.activities;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.edu.weaves.R;

public class MainActivity extends ParentActivity {
    Button btn_plain, btn_twill, btn_invent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        btn_plain = (Button) findViewById(R.id.btn_plain);
        btn_twill = (Button) findViewById(R.id.btn_twill);
        btn_invent = (Button) findViewById(R.id.btn_invent);
        btn_plain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(PlainActivity.class);
            }
        });

        btn_twill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(TwillActivity.class);
            }
        });

        btn_invent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(InventActivity.class);
            }
        });
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.main_activity;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        if (session.isLoggedIn()) {
            menu.getItem(0).setVisible(false);
            menu.getItem(1).setVisible(true);
            menu.getItem(1).setTitle(db.getUser(1).getName());
        } else {
            menu.getItem(0).setVisible(true);
            menu.getItem(1).setVisible(false);
        }
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_register:
                openActivity(RegisterActivity.class);
                return true;
            case R.id.action_account:
                openActivity(AccountActivity.class);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finishAffinity();
    }
}

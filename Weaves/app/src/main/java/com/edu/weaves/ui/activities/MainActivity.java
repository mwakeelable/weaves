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
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        } else if (id == R.id.action_login) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

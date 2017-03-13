package com.edu.weaves.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.edu.weaves.R;

public class TwillActivity extends ParentActivity {
    LinearLayout btn_level1, btn_level2, btn_level3, btn_level4, btn_level5, btn_level6,
            btn_level7, btn_level8, btn_level9, btn_level10, btn_level11, btn_level12;
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
        btn_level1 = (LinearLayout) findViewById(R.id.twill_one);
        btn_level2 = (LinearLayout) findViewById(R.id.twill_two);
        btn_level3 = (LinearLayout) findViewById(R.id.twill_three);
        btn_level4 = (LinearLayout) findViewById(R.id.twill_four);
        btn_level5 = (LinearLayout) findViewById(R.id.twill_five);
        btn_level6 = (LinearLayout) findViewById(R.id.twill_six);
        btn_level7 = (LinearLayout) findViewById(R.id.twill_seven);
        btn_level8 = (LinearLayout) findViewById(R.id.twill_eight);
        btn_level9 = (LinearLayout) findViewById(R.id.twill_nine);
        btn_level10 = (LinearLayout) findViewById(R.id.twill_ten);
        btn_level11 = (LinearLayout) findViewById(R.id.twill_eleven);
        btn_level12 = (LinearLayout) findViewById(R.id.twill_twelve);

        btn_level1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TwillActivity.this, TwillLevelsActivity.class);
                intent.putExtra("level", 1);
                startActivity(intent);
            }
        });
        btn_level2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TwillActivity.this, TwillLevelsActivity.class);
                intent.putExtra("level", 2);
                startActivity(intent);
            }
        });
        btn_level3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TwillActivity.this, TwillLevelsActivity.class);
                intent.putExtra("level", 3);
                startActivity(intent);
            }
        });
        btn_level4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TwillActivity.this, TwillLevelsActivity.class);
                intent.putExtra("level", 4);
                startActivity(intent);
            }
        });
        btn_level5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TwillActivity.this, TwillLevelsActivity.class);
                intent.putExtra("level", 5);
                startActivity(intent);
            }
        });
        btn_level6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TwillActivity.this, TwillLevelsActivity.class);
                intent.putExtra("level", 6);
                startActivity(intent);
            }
        });
        btn_level7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TwillActivity.this, TwillLevelsActivity.class);
                intent.putExtra("level", 7);
                startActivity(intent);
            }
        });
        btn_level8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TwillActivity.this, TwillLevelsActivity.class);
                intent.putExtra("level", 8);
                startActivity(intent);
            }
        });
        btn_level9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TwillActivity.this, TwillLevelsActivity.class);
                intent.putExtra("level", 9);
                startActivity(intent);
            }
        });
        btn_level10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TwillActivity.this, TwillLevelsActivity.class);
                intent.putExtra("level", 10);
                startActivity(intent);
            }
        });
        btn_level11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TwillActivity.this, TwillLevelsActivity.class);
                intent.putExtra("level", 11);
                startActivity(intent);
            }
        });
        btn_level12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TwillActivity.this, TwillLevelsActivity.class);
                intent.putExtra("level", 12);
                startActivity(intent);
            }
        });
    }
    @Override
    protected int getLayoutResourceId() {
        return R.layout.twill_activity;
    }
}

package com.edu.weaves.ui.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import com.edu.weaves.R;
import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;

import java.util.ArrayList;

import za.co.riggaroo.materialhelptutorial.TutorialItem;
import za.co.riggaroo.materialhelptutorial.tutorial.MaterialTutorialActivity;

public class PlainLevelsActivity extends ParentActivity {
    private static final int REQUEST_CODE = 1234;
    public FloatingActionMenu btn_plain_options;
    public FloatingActionButton btn_change_color, btn_change_fabric;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button buttonViewTutorial = (Button) findViewById(R.id.buttonViewTutorial);
        buttonViewTutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadTutorial();
            }
        });
        btn_plain_options = (FloatingActionMenu) findViewById(R.id.btn_plain_options);
        btn_change_color = (FloatingActionButton) findViewById(R.id.btn_plain_color);
        btn_change_fabric = (FloatingActionButton) findViewById(R.id.btn_plain_fabric);

    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.plain_levels_activity;
    }

    public void loadTutorial() {
        Intent mainAct = new Intent(this, MaterialTutorialActivity.class);
        mainAct.putParcelableArrayListExtra(MaterialTutorialActivity.MATERIAL_TUTORIAL_ARG_TUTORIAL_ITEMS, getTutorialItems(this));
        startActivityForResult(mainAct, REQUEST_CODE);

    }

    private ArrayList<TutorialItem> getTutorialItems(Context context) {
        TutorialItem tutorialItem1 = new TutorialItem(R.string.slide_1_african_story_books, R.string.slide_1_african_story_books,
                R.color.slide_1, R.drawable.tut_page_1_front, R.drawable.tut_page_1_background);

        TutorialItem tutorialItem2 = new TutorialItem(R.string.slide_2_volunteer_professionals, R.string.slide_2_volunteer_professionals_subtitle,
                R.color.slide_2, R.drawable.tut_page_2_front, R.drawable.tut_page_2_background);

        TutorialItem tutorialItem3 = new TutorialItem(context.getString(R.string.slide_3_download_and_go), null,
                R.color.slide_3, R.drawable.tut_page_3_foreground);

        TutorialItem tutorialItem4 = new TutorialItem(R.string.slide_4_different_languages, R.string.slide_4_different_languages_subtitle,
                R.color.slide_4, R.drawable.tut_page_4_foreground, R.drawable.tut_page_4_background);

        ArrayList<TutorialItem> tutorialItems = new ArrayList<>();
        tutorialItems.add(tutorialItem1);
        tutorialItems.add(tutorialItem2);
        tutorialItems.add(tutorialItem3);
        tutorialItems.add(tutorialItem4);

        return tutorialItems;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        //    super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK && requestCode == REQUEST_CODE) {

        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            if (btn_plain_options.isOpened())
                btn_plain_options.close(true);
        }
        return super.dispatchTouchEvent(event);
    }

    @Override
    public void onBackPressed() {
        if (btn_plain_options.isOpened())
            btn_plain_options.close(true);
        else
            super.onBackPressed();
    }
}

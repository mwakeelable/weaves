package com.edu.weaves.ui.activities;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.edu.weaves.R;

import java.util.ArrayList;

import za.co.riggaroo.materialhelptutorial.TutorialItem;
import za.co.riggaroo.materialhelptutorial.tutorial.MaterialTutorialActivity;

public class TwillLevelsActivity extends ParentActivity {
    private static final int REQUEST_CODE = 1234;

    @Override
    protected int getLayoutResourceId() {
        return 0;
    }

    public void loadTutorial() {
        Intent mainAct = new Intent(this, MaterialTutorialActivity.class);
        mainAct.putParcelableArrayListExtra(MaterialTutorialActivity.MATERIAL_TUTORIAL_ARG_TUTORIAL_ITEMS, getTutorialItems(this));
        startActivityForResult(mainAct, REQUEST_CODE);

    }

    private ArrayList<TutorialItem> getTutorialItems(Context context) {
        TutorialItem tutorialItem1 = new TutorialItem(R.string.slide_1_african_story_books, R.string.slide_1_african_story_books,
                R.color.slide_1, R.drawable.tut_page_1_front,  R.drawable.tut_page_1_background);

        TutorialItem tutorialItem2 = new TutorialItem(R.string.slide_2_volunteer_professionals, R.string.slide_2_volunteer_professionals_subtitle,
                R.color.slide_2,  R.drawable.tut_page_2_front,  R.drawable.tut_page_2_background);

        TutorialItem tutorialItem3 = new TutorialItem(context.getString(R.string.slide_3_download_and_go), null,
                R.color.slide_3, R.drawable.tut_page_3_foreground);

        TutorialItem tutorialItem4 = new TutorialItem(R.string.slide_4_different_languages, R.string.slide_4_different_languages_subtitle,
                R.color.slide_4,  R.drawable.tut_page_4_foreground, R.drawable.tut_page_4_background);

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
        if (resultCode == RESULT_OK && requestCode == REQUEST_CODE){
            Toast.makeText(this, "Tutorial finished", Toast.LENGTH_LONG).show();

        }
    }
}

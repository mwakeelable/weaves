package com.edu.weaves.ui.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.edu.weaves.R;
import com.edu.weaves.ui.activities.TwillActivity;
import com.edu.weaves.ui.activities.TwillLevelsActivity;

public class TwillLevelFragment extends Fragment {
    TwillLevelsActivity activity;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        activity = (TwillLevelsActivity) getActivity();
        return inflater.inflate(R.layout.twill_levels_fragment,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView txt_level = (TextView) view.findViewById(R.id.txt_twill_level_number);
        txt_level.setText("Level " + activity.level);
    }
}

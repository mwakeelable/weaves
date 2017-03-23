package com.edu.weaves.ui.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.edu.weaves.R;
import com.edu.weaves.ui.activities.PlainActivity;
import com.edu.weaves.ui.activities.PlainLevelsActivity;

public class PlainLevelFragment extends Fragment {
    PlainLevelsActivity activity;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        activity = (PlainLevelsActivity) getActivity();
        return inflater.inflate(R.layout.plain_levels_fragment,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

    }
}

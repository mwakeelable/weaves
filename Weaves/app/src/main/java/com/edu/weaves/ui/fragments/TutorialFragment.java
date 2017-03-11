package com.edu.weaves.ui.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.cleveroad.splittransformation.SquareViewPagerIndicator;
import com.cleveroad.splittransformation.TransformationAdapterWrapper;
import com.edu.weaves.R;
import com.edu.weaves.ui.activities.MainActivity;
import com.edu.weaves.ui.activities.TutorialActivity;

public class TutorialFragment extends Fragment {

    public static TutorialFragment instance() {
        return new TutorialFragment();
    }

    private TutorialActivity activity;
    private ViewPager viewPager;
    private SquareViewPagerIndicator indicator;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        activity = (TutorialActivity) getActivity();
        return inflater.inflate(R.layout.fragment_view_pager, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        viewPager = (ViewPager) view.findViewById(R.id.view_pager);
        indicator = (SquareViewPagerIndicator) view.findViewById(R.id.indicator);
        Button btn_skip = (Button) view.findViewById(R.id.btn_skip);

        SimplePagerAdapter adapter = new SimplePagerAdapter(getContext());
        TransformationAdapterWrapper wrapper = TransformationAdapterWrapper
                .wrap(getContext(), adapter)
                .rows(10)
                .columns(7)
                .marginTop(getResources().getDimensionPixelSize(R.dimen.margin_top))
                .bitmapScale(1f)
                .build();
        viewPager.setAdapter(wrapper);
        viewPager.setPageTransformer(false, wrapper);
        indicator.initializeWith(viewPager);
        btn_skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity.session.setFirstTimeLaunch(false);
                activity.openActivity(MainActivity.class);
            }
        });
    }

    @Override
    public void onDestroyView() {
        indicator.reset();
        super.onDestroyView();
    }

    @Override
    public void onResume() {
        super.onResume();
        getActivity().setTitle(R.string.simple_views);
    }

    private static class SimplePagerAdapter extends PagerAdapter {

        private final int[] drawables = new int[]{
                R.drawable.administrator,
                R.drawable.cashier,
                R.drawable.cook,
                R.drawable.administrator,
                R.drawable.cashier,
                R.drawable.cook,
                R.drawable.administrator,
                R.drawable.cashier,
                R.drawable.cook,
        };

        private final Context context;
        private final LayoutInflater inflater;

        public SimplePagerAdapter(Context context) {
            this.context = context;
            this.inflater = LayoutInflater.from(context);
        }

        @Override
        public int getCount() {
            return drawables.length;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            View view = inflater.inflate(R.layout.pager_item, container, false);
            ImageView imageView = (ImageView) view.findViewById(R.id.image);
            imageView.setImageDrawable(ContextCompat.getDrawable(context, drawables[position]));
            container.addView(view);
            return view;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }
    }
}
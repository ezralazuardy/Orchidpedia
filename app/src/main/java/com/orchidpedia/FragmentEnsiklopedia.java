package com.orchidpedia;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

/**
 * Created by ezra on 1/4/18.
 */

public class FragmentEnsiklopedia extends Fragment {

    View v;
    ViewPager mViewPager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_ensiklopedia, container, false);

        mViewPager = v.findViewById(R.id.pager);
        mViewPager.setAdapter(new SamplePagerAdapter(getChildFragmentManager()));
        mViewPager.setPageTransformer(true, new ZoomOutPageTransformer());

        return v;
    }

    public class SamplePagerAdapter extends FragmentPagerAdapter {

        SamplePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new Ensiklopedia_1_Card();

                case 1:
                    return new Ensiklopedia_2_Card();

                case 2:
                    return new Ensiklopedia_3_Card();

                case 3:
                    return new Ensiklopedia_4_Card();

                case 4:
                    return new Ensiklopedia_5_Card();

                case 5:
                    return new Ensiklopedia_6_Card();

                case 6:
                    return new Ensiklopedia_7_Card();

                case 7:
                    return new Ensiklopedia_8_Card();

                case 8:
                    return new Ensiklopedia_9_Card();

                case 9:
                    return new Ensiklopedia_10_Card();

                case 10:
                    return new Ensiklopedia_11_Card();

                case 11:
                    return new Ensiklopedia_12_Card();

                case 12:
                    return new Ensiklopedia_13_Card();

                case 13:
                    return new Ensiklopedia_14_Card();

                case 14:
                    return new Ensiklopedia_15_Card();

                case 15:
                    return new Ensiklopedia_16_Card();

                case 16:
                    return new Ensiklopedia_17_Card();

                case 17:
                    return new Ensiklopedia_18_Card();

                case 18:
                    return new Ensiklopedia_19_Card();

                case 19:
                    return new Ensiklopedia_20_Card();

                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return 20;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            super.destroyItem(container, position, object);
        }

    }

    @Override
    public void onDestroy() {
        unbindDrawables(v);
        if (v != null) {
            v = null;
        }
        System.gc();
        super.onDestroy();
    }

    protected void unbindDrawables(View view) {
        if (view != null) {
            if (view.getBackground() != null) {
                view.getBackground().setCallback(null);
            }
            if (view instanceof ViewGroup && !(view instanceof AdapterView)) {
                for (int i = 0; i < ((ViewGroup) view).getChildCount(); i++) {
                    unbindDrawables(((ViewGroup) view).getChildAt(i));
                }
                ((ViewGroup) view).removeAllViews();
            }
        }
    }
}
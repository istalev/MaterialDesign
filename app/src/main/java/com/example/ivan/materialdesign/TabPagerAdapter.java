package com.example.ivan.materialdesign;

import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TabPagerAdapter extends PagerAdapter {
    private final LayoutInflater layoutInflater;
    private final int numTabs;

    public TabPagerAdapter(LayoutInflater layoutInflater, int numTabs) {
        this.layoutInflater = layoutInflater;
        this.numTabs = numTabs;
    }

    @Override
    public Object instantiateItem(final ViewGroup collection, int position) {
        View tabView;
        switch (position) {
            case 0:
                tabView = layoutInflater.inflate(R.layout.tab1, collection, false);
                break;
            case 1:
                tabView = layoutInflater.inflate(R.layout.tab2, collection, false);
                break;
            case 2:
                tabView = layoutInflater.inflate(R.layout.tab3, collection, false);
                break;
            default:
                return null;
        }

        collection.addView(tabView);
        return tabView;
    }

    @Override
    public int getCount() {
        return numTabs;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup collection, int position, Object view) {
        collection.removeView((View) view);
    }
}

package com.example.android.abndp5;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;


    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }
 @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new AboutFragmnet();
        } else if (position == 1) {
            return new RestaurantsFragment();
        } else if (position == 2) {
            return new HotelsFragment();
        } else {
            return new TemplesFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.about);
        } else if (position == 1) {
            return mContext.getString(R.string.restaurants);
        } else if (position == 2) {
            return mContext.getString(R.string.hotels);
        } else {
            return mContext.getString(R.string.temples);
        }
    }
}
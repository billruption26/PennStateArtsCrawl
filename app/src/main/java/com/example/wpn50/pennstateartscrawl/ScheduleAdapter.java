package com.example.wpn50.pennstateartscrawl;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by wpn50 on 1/11/2018.
 */

public class ScheduleAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;

    public ScheduleAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    //allow for the fragments to be selected
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new VisArts103Fragment();
        } else if (position == 1) {
            return new PalmerAuditFragment();
        } else{
            return new ZollerCafeFragment();
        }
    }

    //get the amount of fragments to look for
    @Override
    public int getCount() {
        return 3;
    }

    //create the title of each fragment for the top bar
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.vis_arts_103_fragment);
        } else if (position == 1) {
            return mContext.getString(R.string.palmer_auditorium_fragment);
        } else {
            return mContext.getString(R.string.zoller_cafe_fragment);
        }
    }
}
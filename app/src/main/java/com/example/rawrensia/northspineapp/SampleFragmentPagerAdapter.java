package com.example.rawrensia.northspineapp;

/**
 * Created by rawrensia on 17/9/18.
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.astuetz.PagerSlidingTabStrip;

/**
 * Created by rawrensia on 17/9/18.
 */

public class SampleFragmentPagerAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 3;
    private String tabTitles[] = new String[] { "Networking", "CCAs/Clubs", "Surveys" };
    //private int tabIcons[] = {R.drawable.group, R.drawable.antilope, R.drawable.chopsticks};

    public SampleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        //return Networking.newInstance(position + 1);

        switch (position){
            case 0: return Networking.newInstance(1);
            case 1: return Club.newInstance(2);
            case 2: return Promotion.newInstance(3);
            default: return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}

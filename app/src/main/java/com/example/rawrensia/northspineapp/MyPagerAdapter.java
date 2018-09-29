package com.example.rawrensia.northspineapp;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by rawrensia on 17/9/18.
 */

public class MyPagerAdapter extends FragmentStatePagerAdapter{

    int numTabs;
    public MyPagerAdapter(FragmentManager fm, int num_tabs){
        super(fm);
        this.numTabs = num_tabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                Networking tab1 = new Networking();
                return tab1;
            case 1:
                Club tab2 = new Club();
                return tab2;
            case 2:
               Promotion tab3 = new Promotion();
                return tab3;
            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return 3;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0: return "Tab 1";
            case 1: return "Tab 2";
            default: return null;
        }
    }
}

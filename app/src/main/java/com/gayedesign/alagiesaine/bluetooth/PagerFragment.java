package com.gayedesign.alagiesaine.learnbasics;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class PagerFragment extends FragmentPagerAdapter{
    private ArrayList<Fragment> fragments = new ArrayList();
    private ArrayList<String> strings = new ArrayList();

    public PagerFragment(FragmentManager fm) {
        super(fm);
    }

    public void addFragments(Fragment fragment, String string){
        this.fragments.add(fragment);
        this.strings.add(string);
    }


    @Override
    public Fragment getItem(int position) {

        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        super.getPageTitle(position);
        return strings.get(position);
    }
}

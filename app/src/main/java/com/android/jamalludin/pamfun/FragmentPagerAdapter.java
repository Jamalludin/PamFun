package com.android.jamalludin.pamfun;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import java.util.List;

/**
 * Created by jamal on 23/11/15.
 */
public class FragmentPagerAdapter extends android.support.v4.app.FragmentPagerAdapter {
    List<Fragment> fragmentList;
    public FragmentPagerAdapter(FragmentManager fm, List<Fragment> fragmentList) {

        super(fm);

        this.fragmentList = fragmentList;


    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}

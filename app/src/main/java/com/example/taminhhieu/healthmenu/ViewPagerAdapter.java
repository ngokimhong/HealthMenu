package com.example.taminhhieu.healthmenu;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import java.util.List;
import java.util.ArrayList;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment> fragmentList = new ArrayList<>();
    private final List<String>  fragmentListTitle = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentListTitle.size();
    }

    public CharSequence getPageTitle(int position){
        return fragmentListTitle.get(position);

    }

    public void AddFragment(Fragment fragment, String title){
        fragmentList.add(fragment);
        fragmentListTitle.add(title);

    }
}

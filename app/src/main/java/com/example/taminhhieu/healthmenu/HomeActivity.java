package com.example.taminhhieu.healthmenu;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;



public class HomeActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        tabLayout =  findViewById(R.id.tablayout_id);
        appBarLayout =  findViewById(R.id.appbarid);
        viewPager =  findViewById(R.id.viewpager_id);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        //add fragment
        adapter.AddFragment(new FragmentUser(),"User");
        adapter.AddFragment(new FragmentMenu(),"Menu");
        //setup adapter
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        appBarLayout.isLiftOnScroll();
    }
}


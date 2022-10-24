package com.f55121061_andhika.myfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.net.wifi.hotspot2.pps.HomeSp;
import android.os.Bundle;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = (TabLayout) findViewById(R.id.tablayout_id);
        appBarLayout = (AppBarLayout) findViewById(R.id.appbar_id);
        viewPager = (ViewPager) findViewById(R.id.viewpagger_id);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        //Adding Fragment
        adapter.AddFragment(new FragmentHome(), "Home");
        adapter.AddFragment(new FragmentExplore(), "Explore");
        adapter.AddFragment(new FragmentAccount(), "Account");
        //Adding Adapter
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}
package com.dealshare.dealshare;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.dealshare.dealshare.Deal.DealListFragment;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initToolbar();
        initViewPagerAndTabs();
    }

    private void initViewPagerAndTabs() {
        ViewPager viewPager = findViewById(R.id.dealPager);
        DealPagerAdapter pagerAdapter = new DealPagerAdapter(getSupportFragmentManager());
        pagerAdapter.addFragment(new DealListFragment(),getString(R.string.tab_1));
        pagerAdapter.addFragment(new DealListFragment(),getString(R.string.tab_2));
        viewPager.setAdapter(pagerAdapter);

        TabLayout tabLayout = findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);

    }

    private void initToolbar() {
        Toolbar mToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        setTitle("TEST");
        mToolbar.setTitleTextColor(getResources().getColor(R.color.colorAccent));
    }


    static class DealPagerAdapter extends FragmentPagerAdapter
    {
        private final List<Fragment> fragmentList = new ArrayList<>();
        private final List<String> fragmentTitleList = new ArrayList<>();

        public DealPagerAdapter(FragmentManager fragmentManager)
        {
            super(fragmentManager);
        }

        public void addFragment(Fragment fragment,String title)
        {
            fragmentList.add(fragment);
            fragmentTitleList.add(title);
        }

        @Override
        public Fragment getItem(int position) {
            return fragmentList.get(position);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }
        public CharSequence getPageTitle(int position)
        {
            return fragmentTitleList.get(position);
        }
    }
}

package com.smart.abayi.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.smart.abayi.fragment.home.HomeFragment;

public class TabPagerFrarmentAdapter  extends FragmentPagerAdapter {

    private String[] tabs;
    public TabPagerFrarmentAdapter(FragmentManager fm){
        super(fm);
        tabs = new String[]{
                "Новости",
                "Форум",
                "Обсуждения"
        };
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return HomeFragment.getInstance();
            case 1:
                return HomeFragment.getInstance();

            case 2:
                return HomeFragment.getInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return tabs.length;
    }
}

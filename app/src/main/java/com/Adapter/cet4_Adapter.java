package com.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;
import java.util.List;

public class cet4_Adapter extends FragmentStateAdapter {
    List<Fragment>mFragments = new ArrayList<>();

    public cet4_Adapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle,List<Fragment>fragments) {
        super(fragmentManager, lifecycle);
        this.mFragments = fragments;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getItemCount() {
        return mFragments.size();
    }
}

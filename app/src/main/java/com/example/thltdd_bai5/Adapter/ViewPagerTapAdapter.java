package com.example.thltdd_bai5.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.thltdd_bai5.Fragment.Tab1Fragment;
import com.example.thltdd_bai5.Fragment.Tab2Fragment;
import com.example.thltdd_bai5.Fragment.TabAllFragment;

public class ViewPagerTapAdapter extends FragmentStateAdapter {

    public ViewPagerTapAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new Tab1Fragment();
            case 1:
                return new Tab2Fragment();
            case 2:
                return new TabAllFragment();
            default:
                return new Tab1Fragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}

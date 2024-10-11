package com.example.thltdd_bai5.Fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.thltdd_bai5.Adapter.ViewPagerTapAdapter;
import com.example.thltdd_bai5.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class ScoreFragment extends Fragment {

    private ViewPager2 viewPager;
    private TabLayout tabLayout;
    @SuppressLint("WrongViewCast")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_score, container, false);

        viewPager = view.findViewById(R.id.view_pager_score);
        tabLayout = view.findViewById(R.id.tab_layout);

        ViewPagerTapAdapter adapter = new ViewPagerTapAdapter(getActivity());
        viewPager.setAdapter(adapter);

        new TabLayoutMediator(tabLayout, viewPager,
            (tab, position) -> {
                switch (position) {
                    case 0:
                        tab.setText("Học kỳ I");
                        break;
                    case 1:
                        tab.setText("Học Kỳ II");
                        break;
                    case 2:
                        tab.setText("Cả năm");
                        break;
                }
            }).attach();
        return view;
    }
}
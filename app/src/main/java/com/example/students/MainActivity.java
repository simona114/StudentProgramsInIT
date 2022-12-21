package com.example.students;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager2 viewPager2 = findViewById(R.id.pager);
        ScreenSlidePagerAdapter adapter = new ScreenSlidePagerAdapter(this);
        viewPager2.setAdapter(adapter);
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        new TabLayoutMediator(tabLayout, viewPager2,
                (tab, position) -> {
                    if (position == 0) {
                        tab.setText(getString(R.string.specialty_business_informatics));
                    } else if (position == 1) {
                        tab.setText(getString(R.string.specialty_computer_programming));
                    } else {
                        tab.setText(getString(R.string.specialty_game_development));
                    }
                }).attach();
    }
}
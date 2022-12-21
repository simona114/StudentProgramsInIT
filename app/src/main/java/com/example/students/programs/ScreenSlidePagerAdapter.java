package com.example.students.programs;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.students.programs.BusinessInformaticsStudentsFragment;
import com.example.students.programs.ComputerProgrammingStudentsFragment;
import com.example.students.programs.GameDevelopmentStudentsFragment;

public class ScreenSlidePagerAdapter extends FragmentStateAdapter {

    public ScreenSlidePagerAdapter(FragmentActivity fa) {
        super(fa);
    }

    private static final int NUM_PAGES = 3;

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 0) {
            return new BusinessInformaticsStudentsFragment();
        } else if (position == 1) {
            return new GameDevelopmentStudentsFragment();
        } else {
            return new ComputerProgrammingStudentsFragment();
        }
    }


    @Override
    public int getItemCount() {
        return NUM_PAGES;
    }

}

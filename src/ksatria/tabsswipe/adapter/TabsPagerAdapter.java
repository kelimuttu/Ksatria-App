package ksatria.tabsswipe.adapter;

import mainpackage.ksatria.FragmentBelajar;
import mainpackage.ksatria.FragmentBermain;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsPagerAdapter extends FragmentPagerAdapter {

	public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }
 
    @Override
    public Fragment getItem(int index) {
 
        switch (index) {
        case 0:
            // Belajar
            return new FragmentBelajar();
        case 1:
            // Bermain
            return new FragmentBermain();
        }
 
        return null;
    }
 
    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 2;
    }
}

package l2ol3otic.project.onepage;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.PagerAdapter;

/**
 * Created by l2ol3otic2 on 6/25/2015.
 */
public class MyPageAdapter extends PagerAdapter {

    private final int NUM_ITEMS = 3;

    public MyPageAdapter(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

    public Fragment getItem(int position) {
        if(position == 0)
            return OneFragment.newInstance();
        else if(position == 1)
            return TwoFragment.newInstance();
        else if(position == 2)
            return ThreeFragment.newInstance();
        return null;
    }

}

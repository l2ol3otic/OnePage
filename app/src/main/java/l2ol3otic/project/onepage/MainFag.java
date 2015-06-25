package l2ol3otic.project.onepage;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

/**
 * Created by l2ol3otic2 on 6/25/2015.
 */
public class MainFag extends FragmentActivity {
    MyPageAdapter adapter;
    ViewPager pager;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.flay);

        adapter = new MyPageAdapter(getSupportFragmentManager());

        pager = (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(adapter);

    }
}

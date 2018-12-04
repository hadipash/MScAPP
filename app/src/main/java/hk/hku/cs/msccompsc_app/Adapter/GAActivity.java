package hk.hku.cs.msccompsc_app.Adapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import hk.hku.cs.msccompsc_app.R;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class GAActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private SectionsPagerAdapter mSectionsPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ga);

        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        mViewPager = findViewById(R.id.container_ga);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = findViewById(R.id.tabs_ga);
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));


    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {
        private static final int ASSOCIATION_SECTION = 0;
        private static final int ACTIVITY_SECTION = 1;

        SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case ASSOCIATION_SECTION:
                    return new AlumniFragment();
//                case ACTIVITY_SECTION:
//                    return new MessageFragment();
//                case ABOUTHKU_SECTION:
//                    return new AboutHKUFragment();
            }
            return new AlumniFragment();
            // return is required

        }

        @Override
        public int getCount() {
            return 2;
        }
    }
}

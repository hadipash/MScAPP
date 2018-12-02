package hk.hku.cs.msccompsc_app;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class CurriculumActivity extends AppCompatActivity {

    private static final String TAG = "CurriculumActivity";

    private ViewPager mViewPager;
    private SectionsPagerAdapter mSectionsPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curriculum);


        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        mViewPager = findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = findViewById(R.id.tabs);
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));


    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {
        private static final int OVERVIEW_SECTION = 0;
        private static final int COURSE_SECTION = 1;
        private static final int DURATION_SECTION = 2;
        private static final int SYLLIBUS_SECTION = 3;

        SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case OVERVIEW_SECTION:
                    return new OverviewFragment();
//                case COURSE_SECTION:
//                    return new CourseFragment();
//                case DURATION_SECTION:
//                    return new DurationFragment();
//                case SYLLIBUS_SECTION:
//                    return new SyllbusFragment();

            }
            return new OverviewFragment();
            // return is required

        }

        @Override
        public int getCount() {
            return 4;
        }
    }


}

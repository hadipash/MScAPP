package hk.hku.cs.msccompsc_app.About;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import hk.hku.cs.msccompsc_app.R;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;


public class MainAbout extends AppCompatActivity {
    private ViewPager mViewPager;
    private SectionsPagerAdapter mSectionsPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_about);


        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        mViewPager = findViewById(R.id.container_about);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = findViewById(R.id.tabs_about);
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));


    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {
        private static final int FACULTY_SECTION = 0;
        private static final int MESSAGE_SECTION = 1;
        private static final int ABOUTHKU_SECTION = 2;

        SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case FACULTY_SECTION:
                    return new FacultyFragment();
                case MESSAGE_SECTION:
                    return new MessageFragment();
                case ABOUTHKU_SECTION:
                    return new AboutHKUFragment();
            }
            return new FacultyFragment();
            // return is required

        }

        @Override
        public int getCount() {
            return 3;
        }
    }
}

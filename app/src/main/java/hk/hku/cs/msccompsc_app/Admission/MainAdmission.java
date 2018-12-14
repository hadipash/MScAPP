package hk.hku.cs.msccompsc_app.Admission;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import hk.hku.cs.msccompsc_app.R;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;


public class MainAdmission extends AppCompatActivity {
    private ViewPager mViewPager;
    private SectionsPagerAdapter mSectionsPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_admission);


        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        mViewPager = findViewById(R.id.container_admit);
        mViewPager.setAdapter(mSectionsPagerAdapter);
        mViewPager.setCurrentItem(getIntent().getIntExtra("tabID", 0));

        TabLayout tabLayout = findViewById(R.id.tabs_admit);
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));


    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {
        private static final int REQUIRE_SECTION = 0;
        private static final int PROCEDURE_SECTION = 1;
        private static final int FEE_SECTION = 2;
        private static final int WORDS_SECTION = 3;
        private static final int SESSION_SECTION = 4;
        private static final int QA_SESSION = 5;

        SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case REQUIRE_SECTION:
                    return new RequireFragment();
                case PROCEDURE_SECTION:
                    return new ProcedureFragment();
                case FEE_SECTION:
                    return new FeeFragment();
                case WORDS_SECTION:
                    return new WordsFragment();
                case SESSION_SECTION:
                    return new SessionFragment();
                case QA_SESSION:
                    return new QAFragment();
            }
            return new RequireFragment();

        }

        @Override
        public int getCount() {
            return 6;
        }
    }
}

package hk.hku.cs.msccompsc_app.Curriculum;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

import org.w3c.dom.Text;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import hk.hku.cs.msccompsc_app.R;

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
        private static final int REGULATION_SECTION = 3;

        SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case OVERVIEW_SECTION:
                    return new OverviewFragment();
                case COURSE_SECTION:
                    return new CourseFragment();
                case DURATION_SECTION:
                    return new DurationFragment();
                case REGULATION_SECTION:
                    return new RegulationFragment();

            }
            return new OverviewFragment();
            // return is required

        }

        @Override
        public int getCount() {
            return 4;
        }
    }

    public void toggleContent(View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        TextView arrow = (TextView) viewGroup.getChildAt(1);
        TextView description = (TextView) viewGroup.getChildAt(2);

        switch (description.getVisibility()){
            case View.GONE:
                // reverse arrow
                arrow.setText(R.string.arrow_up);
                // set course description visible
                description.setVisibility(View.VISIBLE);

                break;

            case View.VISIBLE:
                // reverse arrow
                arrow.setText(R.string.arrow_down);
                // set course description gone
                description.setVisibility(View.GONE);

                break;
        }
    }
}

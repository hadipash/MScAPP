package hk.hku.cs.msccompsc_app.Curriculum;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import hk.hku.cs.msccompsc_app.R;

public class AlumniFragment extends Fragment {
    private static final String TAG = "NewsFeedFragment";

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private View rootView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_alumni, container, false);

//        final ViewPager mViewPager = rootView.findViewById(R.id.alumni_recycle_view);




        mRecyclerView = rootView.findViewById(R.id.alumni_recycle_view);
        mRecyclerView.setHasFixedSize(true);
//        mRecyclerView.setLayoutManager(new LinearLayoutManager(rootView.getContext()));
//        Map<String, String> news_feed_params = new HashMap<>();

//        mRecyclerView.setAdapter(new AlumniAdapter(getStream()));

        mLayoutManager = new LinearLayoutManager(rootView.getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);


        mAdapter = new AlumniAdapter(getStream());
        mRecyclerView.setAdapter(mAdapter);


        return rootView;
    }

    public AlumniAdapter.AlumniObj[] getStream(){
        AlumniAdapter.AlumniObj [] stream = new AlumniAdapter.AlumniObj[4];
        stream[0] = new AlumniAdapter.AlumniObj("HKU CS Career Fair on September 18, 2018",
                "The MSc Programme Office organized the Career Fair on 18 September 2018, aiming to provide students …",
                "Friday, September 21, 2018",
                BitmapFactory.decodeResource(getResources(), R.mipmap.career_fair2018sep_5));
        stream[1] = new AlumniAdapter.AlumniObj("MSc(CompSc) Welcoming Reception 2018",
                "The Welcoming Reception for Cohort 2018 MSc(CompSc) students was held at Wang Gungwu Lecture …",
                "Sunday, September 2, 2018",
                BitmapFactory.decodeResource(getResources(), R.mipmap.welcoming_reception2018_1));
        stream[2] = new AlumniAdapter.AlumniObj("HKU CS Career Talk on March 19, 2018",
                "The MSc Programme Office organized a career talk for current CS students on 19 March 2018. It was …",
                "Monday, March 19, 2018",
                BitmapFactory.decodeResource(getResources(), R.mipmap.career_talk2018mar_2));
        stream[3] = new AlumniAdapter.AlumniObj("2017 Christmas Party in Shanghai",
                "HKU MSc(CompSc) Shanghai Alumni Association organized a Christmas party on 23 Dec 2017. 25 alumni …",
                "Thursday, December 28, 2017",
                BitmapFactory.decodeResource(getResources(), R.mipmap.alumni_sh_christmas2_s));


        return stream;
    }
}
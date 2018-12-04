package hk.hku.cs.msccompsc_app.Adapter;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
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
        mRecyclerView.setLayoutManager(new LinearLayoutManager(rootView.getContext()));
//        Map<String, String> news_feed_params = new HashMap<>();

        mRecyclerView.setAdapter(new AlumniAdapter(getStream()));



        return rootView;
    }

    public AlumniAdapter.StreamObj[] getStream(){
        AlumniAdapter.StreamObj [] stream = new AlumniAdapter.StreamObj[4];
        stream[0] = new AlumniAdapter.StreamObj("Cyber Security",
                "The Cyber Security Stream is a multidisciplinary area of study and " +
                        "professional activity concerned with state-of-the-art technology in cyber security. " +
                        "The curriculum covers different aspects of cyber security from different perspectives, " +
                        "including technical, organisational, human-oriented and legal.",
                BitmapFactory.decodeResource(getResources(), R.mipmap.information_security));
        stream[1] = new AlumniAdapter.StreamObj("Multimedia Computing",
                "The Multimedia Computing Stream focuses on multimedia computing, communications, analytics, " +
                        "visualisation and applications.\n" +
                        "\n" +
                        "Multimedia Computing encompasses media coding and processing, streaming-media middleware, " +
                        "media representations, real-time protocols, media analysis, " +
                        "and human-interaction and visualisation techniques.\n" +
                        "\n" +
                        "Students are encouraged to develop innovative ideas using the latest development in technology such as " +
                        "mobile devices and big-data analytics.",
                BitmapFactory.decodeResource(getResources(), R.mipmap.multimedia_computing));
        stream[2] = new AlumniAdapter.StreamObj("Financial Computing",
                "The Financial Computing Stream is the study of data and algorithms used in finance and the mathematics " +
                        "of computer programs that realise financial models or systems.\n" +
                        "\n" +
                        "Financial Computing emphasises practical numerical methods and focuses on techniques that are directly " +
                        "applicable to business and financial analysis.\n" +
                        "\n" +
                        "The emphasis will be in the computing aspect of the financial industry.",
                BitmapFactory.decodeResource(getResources(), R.mipmap.financial_computing));
        stream[3] = new AlumniAdapter.StreamObj("General Stream",
                "The General Stream covers a broad, comprehensive range of Computer Science subjects, " +
                        "including a wide range of courses from which students can choose from. " +
                        "It offers students the most flexibility to design their own study portfolio based on their career aspiration or " +
                        "requirements.",
                BitmapFactory.decodeResource(getResources(), R.mipmap.general_stream));


        return stream;
    }
}
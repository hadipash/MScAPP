package hk.hku.cs.msccompsc_app.Curriculum;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import hk.hku.cs.msccompsc_app.R;

public class OverviewFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_curriculum, container, false);

        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.study_stream_recycler_view);
        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(rootView.getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);


        mAdapter = new StudyStreamAdapter(getStream());
        mRecyclerView.setAdapter(mAdapter);


        return rootView;
    }

    public StudyStreamAdapter.StreamObj[] getStream(){
        StudyStreamAdapter.StreamObj [] stream = new StudyStreamAdapter.StreamObj[4];
        stream[0] = new StudyStreamAdapter.StreamObj("Cyber Security",
                "The Cyber Security Stream is a multidisciplinary area of study and " +
                        "professional activity concerned with state-of-the-art technology in cyber security. " +
                        "The curriculum covers different aspects of cyber security from different perspectives, " +
                        "including technical, organisational, human-oriented and legal.",
                BitmapFactory.decodeResource(getResources(), R.mipmap.information_security));
        stream[1] = new StudyStreamAdapter.StreamObj("Multimedia Computing",
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
        stream[2] = new StudyStreamAdapter.StreamObj("Financial Computing",
                "The Financial Computing Stream is the study of data and algorithms used in finance and the mathematics " +
                        "of computer programs that realise financial models or systems.\n" +
                        "\n" +
                        "Financial Computing emphasises practical numerical methods and focuses on techniques that are directly " +
                        "applicable to business and financial analysis.\n" +
                        "\n" +
                        "The emphasis will be in the computing aspect of the financial industry.",
                BitmapFactory.decodeResource(getResources(), R.mipmap.financial_computing));
        stream[3] = new StudyStreamAdapter.StreamObj("General Stream",
                "The General Stream covers a broad, comprehensive range of Computer Science subjects, " +
                        "including a wide range of courses from which students can choose from. " +
                        "It offers students the most flexibility to design their own study portfolio based on their career aspiration or " +
                        "requirements.",
                BitmapFactory.decodeResource(getResources(), R.mipmap.general_stream));


        return stream;
    }
}

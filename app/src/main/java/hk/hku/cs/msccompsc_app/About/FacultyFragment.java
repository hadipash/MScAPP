package hk.hku.cs.msccompsc_app.About;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import hk.hku.cs.msccompsc_app.R;

public class FacultyFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_faculty, container, false);


        mRecyclerView = rootView.findViewById(R.id.faculty_recycle_view);
        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new GridLayoutManager(rootView.getContext(),3);
        mRecyclerView.setLayoutManager(mLayoutManager);

        if (isAdded()) {
            Bitmap[] image = {
                    BitmapFactory.decodeResource(getResources(), R.mipmap.prof_chan_h_t_h),
                    BitmapFactory.decodeResource(getResources(), R.mipmap.prof_chan_k_p),
                    BitmapFactory.decodeResource(getResources(), R.mipmap.prof_cheng_r_c_k),
                    BitmapFactory.decodeResource(getResources(), R.mipmap.prof_chimtw),
                    BitmapFactory.decodeResource(getResources(), R.mipmap.prof_choi_l_y_k),
                    BitmapFactory.decodeResource(getResources(), R.mipmap.prof_chowkp),
                    BitmapFactory.decodeResource(getResources(), R.mipmap.prof_chung_h_y),
                    BitmapFactory.decodeResource(getResources(), R.mipmap.prof_lau_v_m_k),
                    BitmapFactory.decodeResource(getResources(), R.mipmap.prof_pun),
                    BitmapFactory.decodeResource(getResources(), R.mipmap.prof_rahmeljuergen),
                    BitmapFactory.decodeResource(getResources(), R.mipmap.prof_schnieders_d),
                    BitmapFactory.decodeResource(getResources(), R.mipmap.prof_null),
                    BitmapFactory.decodeResource(getResources(), R.mipmap.prof_tam),
                    BitmapFactory.decodeResource(getResources(), R.mipmap.prof_ting_h_f)
            };
            String[] names = {
                    "Dr. Chan H.T.H.", "Dr. Chan K.P.","Dr. Cheng R.C.K.","Dr. Chim T.W.","Dr. Choi L.Y.K.",
                    "Dr. Chow K.P.","Dr. Chung H.Y.", "Dr. Lau V.M.K.","Dr. Pun K.K.H.","Dr. Rahmel J.H.",
                    "Dr. Schnieders D.","Dr. Shum C.D.","Dr. Tam A.T.C.","Dr. Ting H.F."
            };
            String[] intro = {
                    "PhD (Carnegie Mellon)\n\nField of Research:\nAlgorithms, Combinatorial Optimization, Graphs, Information Networks, Security & Privacy",
                    "PhD (HK)\n\nField of Research:\n Pattern Recognition, Chinese Computing, Facial Expression Recognition, Machine Learning",
                    "PhD (Purdue)\n\nField of Research:\n Database and Uncertainty Management",
                    "PhD (HK)\n\nField of Research:\nNetwork Security and Cryptography",
                    "PhD (HK)\n\nField of Research:\nMedical Visualization, Geometric Computing, Computer Graphics",
                    "PhD (UC Santa Barbara)\n\nField of Research:\nComputer Forensics, Digital Investigation, Data Privacy, Computer Security",
                    "PhD (HK)\n\nField of Research:\nInternet Computing, Video-coding, Video/Image Processing, Real-time Processing",
                    "PhD (HK)\n\nField of Research:\nUser Interface, Embedded System, Mobile system, Chinese Character, Font and Input Technologies",
                    "PhD (Illinois); LLB, LLM (London)\n\nField of Research:\nInformation Technology Law, e-Commerce, e-Crimes, Computerization of Law",
                    "PhD (Kaiserslautern)\n\nField of Research:\nArtificial Intelligence, Financial Services",
                    "PhD (HK)\n\nField of Research:\nComputer Vision, Image Processing, Pattern Recognition",
                    "PhD (California)\n\nField of Research:\nFinancial Computing",
                    "PhD (HK)\n\nField of Research:\nCluster Computing, Parallel and Distributed Computing",
                    "PhD (Princeton)\n\nField of Research:\nDesign and Analysis of Algorithms"
            };
            mAdapter = new FacultyAdapter(image, names, intro);
            mRecyclerView.setAdapter(mAdapter);

        }

        return rootView;
    }
}

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
                    BitmapFactory.decodeResource(getResources(), R.mipmap.prof_ting_h_f),
                    BitmapFactory.decodeResource(getResources(), R.mipmap.prof_wong_k_k_y),
                    BitmapFactory.decodeResource(getResources(), R.mipmap.prof_wu_c),
                    BitmapFactory.decodeResource(getResources(), R.mipmap.prof_yiu_s_m),
                    BitmapFactory.decodeResource(getResources(), R.mipmap.prof_yiu_s_w),
                    BitmapFactory.decodeResource(getResources(), R.mipmap.prof_mitcheson_g),
                    BitmapFactory.decodeResource(getResources(), R.mipmap.prof_ng_p_t_l),
                    BitmapFactory.decodeResource(getResources(), R.mipmap.prof_cheung_d_w_l),
                    BitmapFactory.decodeResource(getResources(), R.mipmap.prof_kao_b_c_m),
                    BitmapFactory.decodeResource(getResources(), R.mipmap.prof_lam_t_w),
                    BitmapFactory.decodeResource(getResources(), R.mipmap.prof_lau_f_c_m),
                    BitmapFactory.decodeResource(getResources(), R.mipmap.prof_tse),
                    BitmapFactory.decodeResource(getResources(), R.mipmap.prof_wangcl),
                    BitmapFactory.decodeResource(getResources(), R.mipmap.prof_wang_w),
                    BitmapFactory.decodeResource(getResources(), R.mipmap.prof_bebo_white)
            };
            String[] names = {
                    "Dr. Chan H.T.H.", "Dr. Chan K.P.","Dr. Cheng R.C.K.","Dr. Chim T.W.","Dr. Choi L.Y.K.",
                    "Dr. Chow K.P.","Dr. Chung H.Y.", "Dr. Lau V.M.K.","Dr. Pun K.K.H.","Dr. Rahmel J.H.",
                    "Dr. Schnieders D.","Dr. Shum C.D.","Dr. Tam A.T.C.","Dr. Ting H.F.","Dr. Wong K.K.Y.",
                    "Dr. Wu C.","Dr. Yiu S.M.","Dr. Yiu S.W.","Mr. Mitcheson, G.","Mr. Ng P.T.L.","Prof. Cheung D.W.L.",
                    "Prof. Kao B.C.M.","Prof. Lam T.W.","Prof. Lau F.C.M.","Prof. Tse T.H.","Prof. Wang C.L.",
                    "Prof. Wang W.","Prof. White B."
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
                    "PhD (Princeton)\n\nField of Research:\nDesign and Analysis of Algorithms",
                    "PhD (Cambridge)\n\nField of Research\nCamera Calibration, Motion Tracking",
                    "PhD (Toronto)\n\nField of Research\nComputer Networking, Cloud Computing",
                    "PhD (HK)\n\nField of Research\nBioinformatics, Computer Security and Cryptography",
                    "PhD (UC Berkeley)\n\nField of Research\nComputer and Network Security",
                    "BSc, MSc (Manc)\n\nField of Research\nSoftware Engineering, Evolutionary Computation and Design",
                    "MBA (Birmingham)\n\nField of Research\nFinancial Computing",
                    "PhD (Simon Fraser)\n\nField of Research\nData Engineering, e-Commerce Technology",
                    "PhD (Princeton)\n\nField of Research\nDatabase Management Systems, Data Mining, Real-time Systems, Information Retrieval Systems",
                    "PhD (Washington)\n\nField of Research\nAlgorithms, Computational Biology",
                    "PhD (Waterloo)\n\nField of Research\nOperating Systems, Parallel and Distributed Computing, Wireless Networks",
                    "PhD (London)\n\nField of Research\nProgram Testing, Debugging, and Analysis",
                    "PhD (USC)\n\nField of Research\nOperating Systems, Virtual Machines, Cloud Computing",
                    "PhD (Alberta)\n\nField of Research\nComputer Graphics, Computational Geometry, Geometric Modeling",
                    "MS (US)\n\nField of Research\nWeb Science, Social Media in Education, The Web of Things, and Cloud Computing"

            };
            mAdapter = new FacultyAdapter(image, names, intro);
            mRecyclerView.setAdapter(mAdapter);

        }

        return rootView;
    }
}

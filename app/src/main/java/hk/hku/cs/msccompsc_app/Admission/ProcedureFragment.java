package hk.hku.cs.msccompsc_app.Admission;


import android.os.Bundle;
import androidx.fragment.app.Fragment;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import hk.hku.cs.msccompsc_app.R;


/**
 * A simple {@link androidx.fragment.app.Fragment} subclass.
 * Activities that contain this fragment must implement the

 */
public class ProcedureFragment extends Fragment {
    private TextView mtextview;
    private TextView mtextview2;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview =  inflater.inflate(R.layout.fragment_procedure, container, false);
        mtextview = rootview.findViewById(R.id.procedures_text);
        mtextview2 = rootview.findViewById(R.id.procedures_text2);

        String htmltext1 =
                "<div class=\"section scrollspy\" id=\"how-apply\" style=\"background:transparent;\"><p>Applicants can submit their application via the online application system by clicking the following button.</p>\n" +
                "<p style=\"text-align: center;\"><a target=\"_blank\" href=\"http://www.aal.hku.hk/tpg/programme/master-science-computer-science\" class=\"waves-effect waves-light btn-large purple z-depth-5\">Online Application</a></p>\n" +
                "<p>The following supporting documents should be uploaded to the online application system before the application deadline or expiry of your application account (which is valid for four weeks only), whichever is earlier:</p>\n" +
                "<p style=\"padding-left: 30px;\"><big>&bull;&nbsp;</big>Graduate transcript(s) with grading system of all tertiary level studies</p>\n" +
                "<p style=\"padding-left: 30px;\"><big>&bull;</big> Degree certificate(s)</p>\n" +
                "<p style=\"padding-left: 30px;\"><big>&bull;</big><span><span> </span></span>English Language proficiency test score report, such as TOEFL or IELTS (only for applicants with qualifications from institutions outside Hong Kong where the language of instruction and/or examination is not English)</p>\n" +
                "<p style=\"padding-left: 30px;\"><big>&bull;</big><span><span> </span></span>Proof of Cumulative Grade Point Average (CGPA) / average grade / average mark</p>\n" +
                "<p style=\"padding-left: 30px;\"><big>&bull;</big><span><span>&nbsp;</span></span>Official proof of class ranking, if available</p>\n" +
                "<p style=\"padding-left: 30px;\"><big>&bull;</big><span><span> </span></span>A curriculum vitae (C.V.)</p>\n" +
                "<p>Applicants are not required to submit original documents during the application stage. &nbsp;Should an applicant be given an admission offer by the Programme, he/she will receive notification of the need to submit original/certified true copy* of the documents to the MSc(CompSc) Programme Office.</p>\n" +
                "<p>Please note that documents once submitted will not be returned, and will be destroyed if the application is unsuccessful.</p>\n" +
                "<p>*The University will only ACCEPT originals and copies of the documents that have been duly declared as true copies before a notary public.</p>\n" +
                "</div>\n" +
                "<div class=\"section scrollspy\" id=\"app-fee\" style=\"background:transparent;\"><p><strong>Application Fee</strong></p>\n" +
                "<p>The application fee is HK$300<strong>, </strong>paid by credit card online.<strong><br /></strong></p>\n" +
                "</div>\n<p><strong>Application Timetable</strong></p>";

        String htmltext2 = "<p>To be considered for a round, you must submit a complete application, including all online / mail-in materials by the day of the deadline.</p>\n" +
                "<p>The results for admission in September are normally available by July of the same year. Hence, applicants who do not hear from the Faculty of Engineering by July 31, 2019 may assume the application to be unsuccessful.</p>\n" ;

        mtextview.setText(Html.fromHtml(htmltext1));
        mtextview2.setText(Html.fromHtml(htmltext2));
        return rootview;
    }


}
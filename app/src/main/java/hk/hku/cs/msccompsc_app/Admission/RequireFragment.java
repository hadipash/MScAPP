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
public class RequireFragment extends Fragment {

    private TextView mtextview;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview =  inflater.inflate(R.layout.fragment_require, container, false);
        mtextview = rootview.findViewById(R.id.requirement_text);

        String htmltext = "<article class=\"page content-item\">\n" +
//                "<div class=\"container-fluid\">\n" +
//                "    <header>\n" +
//                "        \n" +
//                "    </header>\n" +
//                "    \n" +
//                "<div class=\"orchard-layouts-root\">\n" +
//                "    \n" +
//                "<div class=\"msccs-admission\">\n" +
//                "<h4 class=\"section scrollspy\" id=\"adm-req\" style=\"background:transparent;\"> Admission Requirements</h4>\n" +
                "\n" +
                "<div class=\"section scrollspy\" id=\"Eligibility\" style=\"background:transparent;\"><p><strong>Eligibility</strong></p>\n" +
                "<p>To be eligible for admission to the programmes, a candidate shall satisfy both the University Entrance Requirements and the Programme Entrance Requirements including but not limited to:</p>\n" +
                "<p style=\"padding-left: 30px;\">a.&nbsp; &nbsp; shall comply with the General Regulations;</p>\n" +
                "<p style=\"padding-left: 30px;\">b.&nbsp; &nbsp; shall hold a Bachelor&rsquo;s degree of this University or a qualification of equivalent standard from this University or another comparable institution accepted for this purpose;</p>\n" +
                "<p style=\"padding-left: 30px;\">c.&nbsp; &nbsp; for a candidate who is seeking admission on the basis of a qualification from a university or comparable institution outside Hong Kong of which the language of teaching and/or examination is not English, shall satisfy the University English language requirement applicable to high degrees as prescribed under General Regulation G2(b); and</p>\n" +
                "<p style=\"padding-left: 30px;\">d.&nbsp; &nbsp; satisfy the examiners in a qualifying examination if required.</p>\n" +
                "</div>\n" +
                "<div class=\"section scrollspy\" id=\"regulations\" style=\"background:transparent;word-break:break-word;\"><p><strong>Regulations:</strong></p>\n" +
                "<p style=\"padding-left: 30px;\">1. General Regulations of The University<br /><a href=\"https://www4.hku.hk/pubunit/drcd/files/pgdr2017-18/genreg.pdf\" target=\"_blank\">https://www4.hku.hk/pubunit/drcd/files/pgdr2017-18/genreg.pdf</a></p>\n" +
                "<p style=\"padding-left: 30px;\">2. University's Regulations for Taught Postgraduate Curricula: <br /><a href=\"https://www4.hku.hk/pubunit/drcd/files/pgdr2017-18/tpg-regulations.pdf\" target=\"_blank\">https://www4.hku.hk/pubunit/drcd/files/pgdr2017-18/tpg-regulations.pdf</a></p>\n" +
                "<p style=\"padding-left: 30px;\">3. Degree Regulations of MSc(CompSc) for&nbsp;students admitted to the curriculum in 2017-2018 and thereafter:<br /><a href=\"/Media/Default/RegulationSyllabus/Regulations_MSc_2017-18.pdf\" target=\"_blank\">http://www.msc-cs.hku.hk/Media/Default/RegulationSyllabus/Regulations_MSc_2017-18.pdf</a><br /><a href=\"/Media/Default/RegulationSyllabus/Syllabus_MSc(CompSc)_2018-19.pdf\" target=\"_blank\">http://www.msc-cs.hku.hk/Media/Default/RegulationSyllabus/Syllabus_MSc(CompSc)_2018-19.pdf</a></p>\n" +
                "</div>\n" +
                "<div class=\"section scrollspy\" id=\"eng-req\" style=\"background:transparent;\"><p><strong>English Language Proficiency Requirement</strong></p>\n" +
                "<p>Applicants who wish to be admitted on the basis of a qualification from a university or comparable institution outside Hong Kong where the language of teaching and/or examination is not English are required to obtain:</p>\n" +
                "<p style=\"padding-left: 30px;\">a. a score of 550 or above (paper-based test) or 80 or above (internet-based test) in the Test of English as a Foreign Language (TOEFL).&nbsp; Applicants who took the TOEFL should request the Educational Testing Service (ETS) to send an official score report to the University directly. For this purpose, the HKU TOEFL code is 9671. Test scores more than two years old will not be accepted; or</p>\n" +
                "<p style=\"padding-left: 30px;\">b. a minimum overall band of 6 with no subtest lower than 5.5 in the International English Language Testing System (IELTS); or</p>\n" +
                "<p style=\"padding-left: 30px;\">c.&nbsp;grade C or above in the Overseas General Certificate of Education (GCE); or</p>\n" +
                "<p style=\"padding-left: 30px;\">d. grade C or above in the International General Certificate of Secondary Education (IGCSE); or</p>\n" +
                "<p style=\"padding-left: 30px;\">e. grade C or above in the Cambridge Test of Proficiency in English Language;</p>\n" +
                "<p>unless in exceptional circumstances they are exempted from this requirement.</p>\n" +
//                "</div>\n" +
//                "</div>\n" +
//                "</div>\n" +
//                "</div>\n" +
                "</article>\n" ;


        mtextview.setText(Html.fromHtml(htmltext));

        return rootview;
    }


}
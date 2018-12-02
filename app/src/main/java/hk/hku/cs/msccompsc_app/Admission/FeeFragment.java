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
public class FeeFragment extends Fragment {

    private TextView mtextview;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview =  inflater.inflate(R.layout.fragment_fee, container, false);
        mtextview = rootview.findViewById(R.id.fee_text);

        String htmltext = "<article class=\"page content-item\">\n" +
                "<div class=\"container-fluid\">\n" +
                "    <header>\n" +
                "        \n" +
                "    </header>\n" +
                "    \n" +
                "<div class=\"orchard-layouts-root\">\n" +
                "    \n" +
                "\n" +
                "<h4 class=\"section scrollspy\" id=\"fees\">Composition Fees</h4>\n" +
                "\n" +
                "<div class=\"section scrollspy\" id=\"comp-fee\" style=\"background:transparent;\"><p>The composition fee for each 6-credit course is HK$13,000*. Project has a composition fee of HK$26,000 and the Dissertation has a composition fee of HK$52,000. Total composition fee for the two study modes are therefore as follows:</p>\n" +
                "<p style=\"padding-left: 30px;\"><strong>10 courses + Project:</strong><br /><strong>(HK$13,000 x 10) + (HK$26,000) = HK$156,000</strong></p>\n" +
                "<p style=\"padding-left: 30px;\"><strong>8 Courses + Dissertation:<br /><strong>(HK$13,000 x 8) + (HK$52,000) = HK$156,000</strong></strong></p>\n" +
                "<p>Students who select to study a course from the MSc(ECom&amp;IComp) and MSc(Eng) programmes have to pay HK$13,000* and HK$12,000* respectively per 6-credit course.</p>\n" +
                "<p><em>* Subject to University approval</em></p>\n" +
                "<p>Fees for enrolled courses are paid on semester basis.&nbsp; The first instalment of composition fees of 12 credit-units is payable at the time of acceptance of an offer of admission.&nbsp;</p>\n" +
                "<p>Generally composition fees for cancelled enrolment before specified deadline are not refunded, but can be used to pay for another enrolled course or carried over to the next semester as credit. (Subject to the approval by the University)</p>\n" +
                "</div>\n" +
                "<h4 class=\"section scrollspy\" id=\"finance-assit\" style=\"background:transparent;\">Financial Assistance</h4>\n" +
                "\n" +
                "<div class=\"section scrollspy\" id=\"for-local\" style=\"background:transparent;\"><p><em>For Hong Kong Residents</em></p>\n" +
                "<p style=\"padding-left: 30px;\"><img src=\"/Media/Default/ContentImages/CEFLogo.png\" alt=\"Continuing Education Fund (CEF)\" width=\"50\" height=\"50\" align=\"right\" />Some of our courses have been included in the list of reimbursable courses for the Hong Kong Continuing Education Fund (CEF) which provides reimbursement up to HK$10,000 for eligible local students. &nbsp;More details available at: <a href=\"http://www.wfsfaa.gov.hk/cef/index.htm\" target=\"_blank\">http://www.wfsfaa.gov.hk/cef/index.htm</a></p>\n" +
                "</div>\n" +
                "<div class=\"section scrollspy\" id=\"for-mainland\" style=\"background:transparent;\"><p><em>For PRC Candidates</em></p>\n" +
                "<p style=\"padding-left: 30px;\">PRC students who have successfully applied and been offered a place in the Master of Science in Computer Science as full-time students in Hong Kong have an opportunity to have their composition fees reduced if they apply and are awarded The China Postgraduate Scholarships for Computer Science.</p>\n" +
                "<p style=\"padding-left: 30px;\">The maximum number of scholarships for 2019-20 is thirty, with a maximum value of HK$30,000 each.</p>\n" +
                "<p style=\"padding-left: 30px;\">The scholarships shall be used to meet part of the composition fees for a full-time programme of studies leading to the degree of Master of Science in Computer Science.</p>\n" +
                "<p style=\"padding-left: 30px;\">The scholarships shall be awarded mainly on the basis of academic merits.</p>\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "</div>\n" +
                "</article>\n" ;

        mtextview.setText(Html.fromHtml(htmltext));

        return rootview;
    }


}
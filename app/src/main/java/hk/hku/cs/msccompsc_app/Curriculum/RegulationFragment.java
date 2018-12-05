package hk.hku.cs.msccompsc_app.Curriculum;
;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import hk.hku.cs.msccompsc_app.R;



public class RegulationFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview =  inflater.inflate(R.layout.fragment_regulation, container, false);
        TextView regulation_detail = rootview.findViewById(R.id.regulation_detail);

        String regulation_detail_html = "<p>1. General Regulations of The University <a href=\"https://www4.hku.hk/pubunit/drcd/files/pgdr2017-18/genreg.pdf \" target=\"_blank\">https://www4.hku.hk/pubunit/drcd/files/pgdr2017-18/genreg.pdf</a></p>\n" +
                "<p>2. University's Regulations for Taught Postgraduate Curricula: <a href=\"https://www4.hku.hk/pubunit/drcd/files/pgdr2017-18/tpg-regulations.pdf \" target=\"_blank\">https://www4.hku.hk/pubunit/drcd/files/pgdr2017-18/tpg-regulations.pdf</a></p>\n" +
                "<p>3. Degree Regulations of MSc(CompSc)</p>\n" +
                "<p>The&nbsp;<a href=\"/Media/Default/RegulationSyllabus/Regulations_MSc_2017-18.pdf\">regulations</a> and <a href=\"/Media/Default/RegulationSyllabus/Syllabus_MSc(CompSc)_2018-19.pdf\">syllabus</a> are applicable to students admitted to the curriculum in 2018-2019 and thereafter.</p>";
        regulation_detail.setText(Html.fromHtml(regulation_detail_html));
        return rootview;

    }

}

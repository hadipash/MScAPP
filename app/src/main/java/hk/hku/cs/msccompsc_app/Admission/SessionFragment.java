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
public class SessionFragment extends Fragment {

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
                "<div class=\"table\">\n" +
                "\n" +
                "<div class=\"row\">\n" +
                "<div class=\" col m12\">\n" +
                "<h4>Information Sessions</h4>\n" +
                "<p>Join us at the information sessions, and find out if the Master of Science in Computer Science Programme is the right fit for your career goals. Information Sessions include a programme overview and Q&amp;A, plus the opportunity to talk informally with Programme Director and staff. Potential applicants are welcome.</p>\n" +
                "<p>Information sessions will be organized in Hong Kong and Mainland China. Details of these information sessions will be announced on our website and/or advertised online and in major local newspapers.</p>\n" +
                "<p>Details of the information session:</p>\n" +
                "\n" +
                "<div style=\"padding-bottom:20px;\">\n" +
                "\n" +
                "<article class=\"content-item projection-page\">\n" +
                "    <header>\n" +
                "        \n" +
                "    </header>\n" +
                "    \n" +
                "\n" +
                "\n" +
                "\n" +
                "<div id=\"tblInfoSession\" style=\"display:block;\">\n" +
                "        <table id=\"table-slider\" class=\"striped responsive-table orange \">\n" +
                "            <thead>\n" +
                "                <tr>\n" +
                "                    <th>Date</th>\n" +
                "                    <th>Time</th>\n" +
                "                    \n" +
                "                    <th>\n" +
                "                        Venue \n" +
                "<a href=\"http://www.maps.hku.hk/?type=Locations&amp;id=18&amp;lang=en&amp;name=Chow%20Yei%20Ching%20Building \" target=\"_blank\"><i class=\"material-icons tiny\">location_on</i></a>                    </th>\n" +
                "                    \n" +
                "                </tr>\n" +
                "            </thead>\n" +
                "            <tbody>\n" +
                "                <tr>\n" +
                "                    <td>04 December 2018 (Tuesday)</td>\n" +
                "                    <td>6:30-8:00pm<br />MSc(CompSc) and MSc(ECom&amp;IComp) Information Session</td>\n" +
                "                    \n" +
                "                    <td><div><span>Theatre A, G/F</span></div>\n" +
                "<div><span>Chow Yei Ching Building</span></div>\n" +
                "<div><span>The University of Hong Kong, Pokfulam Road</span></div></td>\n" +
                "                    <td>\n" +
                "                    </td>\n" +
                "                </tr>\n" +
                "            </tbody>\n" +
                "        </table>\n" +
                "        <br />\n" +
                "</div>\n" +
                "<p id=\"infoLink\" style=\"display:none;\">Please check the <a href=\"/Admission/info-session\">Information Session</a> part for details.</p>\n" +
                "</article></div></div></div>\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "</div>\n" +
                "</article>\n" ;


        mtextview.setText(Html.fromHtml(htmltext));

        return rootview;
    }


}